package sesac_3rd.sesac_3rd.config.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@Slf4j
public class WebSecurityConfig {
    @Autowired
    private JwtAuthenticationFilter jwtAuthenticationFilter;

    // 보안 필터 체인 구현
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
//                .cors(withDefaults()) // cors 설정 (기본으로)
                .csrf(CsrfConfigurer::disable) // REST API 서버에서는 일반적으로 CSRF 보호가 필요 없어서 끔
                .sessionManagement(sessionManagement -> sessionManagement
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // JWT 를 사용하고 있으므로 세션 관리하지 않음
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/",
                                "/auth/**",
                                "/api/user/**",
                                "/api/place/**",
                                "/api/meeting/**",
                                "/api/userMeeting/**",
                                "/api/review/**",
                                "/api/chatroom/**",
                                "/api/chatmsg/**",
                                "/api/report/**",
                                "/api/manager/**",
                                "/admin/**",
                                "/ws/**",
                                "/swagger-ui/**",
                                "/v3/api-docs/**",  // OpenAPI 명세
                                "/swagger-ui.html", // Swagger UI 페이지
                                "/swagger-resources/**", // Swagger 리소스
                                "/webjars/**"      // Swagger UI 웹JAR
                        )
                        .permitAll()
                        .anyRequest().authenticated());
        // 요청의 인증을 "/", "/auth/**"경로는 인증없이 접근 가능 (그 외 모든 경로는 인증 필요)

        // CorsFilter 다음에 JWT 인증 필터 추가
        http.addFilterAfter(jwtAuthenticationFilter, CorsFilter.class);

        return http.build();
    }

    // cors 설정 정의
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration config = new CorsConfiguration();
//
//        // 모든 출처, 메소드, 헤더에 대해 허용하는 cors 설정
//        config.setAllowCredentials(true);
//        config.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
////        config.setAllowedOriginPatterns(Arrays.asList("*"));
//        config.setAllowedMethods(Arrays.asList("OPTIONS", "POST", "GET", "DELETE", "PUT", "PATCH"));
//        config.setAllowedHeaders(Arrays.asList("*"));
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//
//        return source;
//    }
}
