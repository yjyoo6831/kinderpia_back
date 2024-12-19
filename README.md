![image](https://github.com/user-attachments/assets/268aa27c-f1da-4a2c-8eca-ebb656a43084)

## 📢 프로젝트 소개
test
* 주제 : 부모와 아이들이 함께할 공간을 소개하며, 모임을 만들어 함께 할 수 있는 웹 페이지
* 기획 의도 : 단순한 서울시 공간 소개를 넘어 서로의 경험을 나누며 소통할 수 있는 네트워크 서비스를 제공하고자 한다.

* 개발 기간 : 2024.10.21 ~ 2024.11.08
* Test ID: test3859
* Test Password: test1234

<br>

## :raising_hand: Backend Developers
#### 김어진 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/qldirr)
- 유저, 관리자 기능 담당

#### 석원준 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/ymind14563)
- 채팅, 신고, 파이프라인 자동화 구축, 배포 담당
- 배포: AWS (EC2, RDS, S3), NGINX

#### 유예진 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/yjyoo6831)
- 장소, 리뷰 CRUD 담당
  
#### 윤예슬 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/errorose)
- 모임 관리 기능 담당

<br>

## 🧰 주요 ERD
![ERD](https://github.com/user-attachments/assets/7d41d709-e5e6-4418-a3e8-92770d9b1a98)



## ❓ 주요 기술 채택 이유
- **Spring Boot** : 모듈화된 아키텍처를 제공하며, 의존성 주입(Dependency Injection)같은 프로그래밍 패턴을 이해하고 많은 예제 및 라이브러리 사용을 위함.
- **Spring Security** : Spring Security와 통합되어 있어, 인증 및 권한 부여에 강력한 기능을 제공하기 위해 채택
- **JPA** : 객체 간 관계를 매핑해 복잡한 연관 관계도 손쉽게 관리할 수 있어 유지보수 편리성을 위해 채택
- **JWT** (JSON Web Token) : 보안 및 서버의 부하를 줄이고, 확장성을 높이기 위해 채택
- **Socket.io** : 채팅 기능을 위해 실시간 양방향 통신이 가능하고, 다양한 이벤트를 쉽게 처리하기 위해 채택
- **Multipart** : AWS 서버에 파일을 업로드하여 서버의 저장 공간 절약 및 파일 관리의 용이성과 파일 형식 및 크기 제한을 위해 채택
- **AWS** : 현재 클라우드 시장에서 가장 큰 점유율을 차지하고 있으며, EC2, S3, RDS 등 다양한 서비스를 지원하고, 자원을 확대/축소 하는 등 유연성의 이점으로 인해 채택
- **Jenkins** : 코드의 자동 빌드 및 배포 프로세스를 수행하여 버전관리의 용이 및 유지보수성 향상을 위함.

<br>


## 페이지 및 기능 소개 

## 메인 페이지 
<img src="https://github.com/user-attachments/assets/3332690a-2a31-413f-9a6c-6606b412eb72" width="auto" height="auto" alt="메인페이지 시작화면">

## 로그인 페이지
- Spring Security를 적용하여 로그인한 유저에 한해 모임생성, 리뷰 쓰기 기능을 제공한다. 
<img src="https://github.com/user-attachments/assets/646bd240-8742-4e46-a917-997d7ce949f4" width="243" height="auto" alt="로그인 페이지">

## 장소 상세 및 리뷰 페이지 
- 장소별 후기 목록과 후기별 좋아요 개수를 보여준다.
<img src="https://github.com/user-attachments/assets/d623c84b-39bc-4f5a-98ae-7cdff044d1db"  width="auto" height="auto" alt="장소 상세조회">
<img src="https://github.com/user-attachments/assets/57b711b9-45a0-4f35-a0f2-0717c9162b61"  width="auto" height="auto" alt="리뷰작성관리">

## 장소 검색 페이지 
- 장소명, 지역 범위를 통해 장소를 검색하고, 별점순으로 필터할 수 있다.
<img src="https://github.com/user-attachments/assets/695a0e93-0dca-4084-8dba-0c37771e13e8"  width="auto" height="auto" alt="장소 검색">

## 모임 생성 페이지 
- 장소, 모임 날짜, 모임 인원을 지정하여 모임 생성을 할 수 있다.
<img src="https://github.com/user-attachments/assets/94873c45-a95a-440f-abba-fca146317e69"  width="243" height="auto" alt=" 모임 생성">

## 모임 참여 페이지 
- 참여하고 싶은 모임에 참여가 가능하다. 
<img src="https://github.com/user-attachments/assets/4d29f7df-13ef-4c6b-85d1-e539535e29f5"  width="243" height="auto" alt=" 모임 참여">

## 채팅 
- 참여한 모임 인원들에 한해 양방향 통신이 가능한 채팅기능을 제공한다. 
<img src="https://github.com/user-attachments/assets/addd56ea-f22b-4273-8250-7246e3eb811f"  width="auto" height="auto" alt="채팅"> 

## 관리자 페이지 
1. 회원 통계
<br>

![adminuser](https://github.com/user-attachments/assets/c435a81e-e2ff-4ac1-9e1d-f018fd98fdd5)


2. 신고 조회
<br>

![adminreport](https://github.com/user-attachments/assets/a4def0d7-5ea3-4a62-b011-de689511273c)
