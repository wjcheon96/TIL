## Java 설치 및 작업환경 구축



### 0.

본 필자는 고용노동부 산하 K-digital Training 과정을 수행한 국비지원 코딩교육 교육생으로, 해당 과정을 수료하고 Java 정리 및 알고리즘 공부를 시작하였다. 교육 도중 Tomcat 서버 및 오라클 DB 등이 컴퓨터와 충돌하는 부분이 다소 존재하여, VMware로 가상환경을 잡고 코딩을 했는데, 해당 과정이 끝나고 새롭게 정리하기에 새로운 환경을 잡고 구축하는 것보다 다시 하고자 한다. 
교육과정 내에서는 Eclipse 환경에서 Java를 구축하였으나, 주변 지인들의 추천에 따라 IntelliJ IDEA를 사용하고자 한다.



### 1. JET BRAINS 회원가입 및 라이센스 획득

설치에 앞서, 회원가입과 라이센스를 먼저 획득해야하는데, 그 이유는 다음과 같다.

해당 프로그램은 JET BRAINS 사의 IntelliJ IDEA를 사용하기에, [IntelliJ IDEA](https://www.jetbrains.com/ko-kr/idea/)로 들어가서 다운로드 버튼을 누를시 다음과 같은 화면이 나온다.

<img src=".\img\img1.PNG" style="zoom:75%;" />



아래와 같이 두개의 버전이 나오는데, 나는 Spring, Java EE, JS, HTML, CSS, DB tools 등을 사용해야 하기에, Ultimate 버전을 사용해야한다.

<img src=".\img\img2.png">



보시다시피 IntelliJ Ultimate는 네이버 기준 약 77만원의 라이센스 비용이 드는 유료 툴로, 해당 라이센스가 있어야 사용가능한데, 학교 메일 인증을 통해서 학생용 계정을 지원하기에, 이를 통해 인증을 받아야 하기에, 회원가입과 라이센스 획득이 필요한 것이다.



해당 과정은 회원가입을 하고, [교육용 JetBrains](https://www.jetbrains.com/shop/eform/students)에 들어가면, 교육용 제품 신청이 가능하며, 해당 과정을 쭉 따라가면 다음과 같은 창과 함께 라이센스가 활성화 된 것을 알 수 있다.

<img src=".\img\img3.png">

우측 상단에 빨간색으로 블러 처리 된 부분은 라이센스 부분으로, 공개할 수 없어 지웠으며, 저 위치에 라이센스 정보가 보이니 그렇게 알면 될듯하다.





### 02. IntelliJ 설치

위와 같은 방법으로 라이센스를 획득했으면, Ultimate 버전을 다운받으면 된다. 설치파일이 하나 다운로드 될 텐데, 이를 설치할때, 이와 같이 설정을 하고 가겠다. 

<img src=".\img\img4.PNG">

이후 쭉 다음 버튼을 눌러서 설치를 완료하면 된다.



그럼 이와 같이 설치가 완료된다.

<img src=".\img\img5.PNG">





### 03. 작업 환경 구축

이제 설치된 IntelliJ IDEA를 실행시키면, 아래와 같이 라이센스 인증을 하라고 나온다.

<img src=".\img\img6.PNG">



그럼 이제 JB Account, 즉 아까 가입했던 JET BRAINS에 파란색 버튼을 눌러 로그인하고, 라이센스 활성화를 하면 다음과 같이 활성화가 완료된다.

<img src=".\img\img7.PNG">





그럼 이제 다음과 같은 화면이 나올텐데, 여기서 New Project를 눌러주면 된다.

<img src=".\img\img8.png">



그럼 다음과 같은 창이 나오는데, 

<img src=".\img\img9.png">



위의 빨간 네모 친 Project SDK 버튼을 눌러 Download JDK를 눌러주면 된다.

<img src=".\img\img10.PNG">



그럼 아래와 같은 창이 나오며, Download 버튼을 눌러 JDK를 다운로드 해주면 끝이다.



이후 다음 버튼을 계속 눌러주다가, 아래 화면에서 프로젝트 이름과 경로, 기본 패키지 설정을 해주면 자바를 사용하는데 있어 기본 설정은 끝이다.

<img src=".\img\img11.PNG">



Eclipse로 Java를 설치하고 구축할 때는 환경 변수 설정부터 JDK 를 따로 설치하고 구축하는 과정이 다소 귀찮았는데, 인텔리제이는 그런거 없이 한번에 가능해 매우 편리한듯 하다.