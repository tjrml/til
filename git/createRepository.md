## Git 저장소 만들기

Git 저장소를 만들 때 주로 두 가지중 한가지 방법으로 저장소를 사용한다. 

 - 버전관리를 하지 않는 로컬 폴더를 선택해서 Git 저장소를 적용하는 방법
 - 다른 Git 저장소를 clone 하는 방법

### 기존 디렉토리를 Git 저장소로 만들기

 - 버전관리를 하지 않는 기존 프로젝트를 Git으로 관리 하고 싶은 경우 프로젝트의 명령어를 통해 폴더로 이동한다.


      git init


 - 위 명령은 **.git**이라는 하위 디렉토리를 생성한다. 
   - **.git** 폴더에는 저장소에 필요한 뼈대 파일(Skeleton)이 들어 있다.  
   - 이 명령만으로는 프로젝트의 어떤 파일도 관리 하지 않는다.
   - Git에서 파일을 관리하게 하려면 저장소에 파일을 추가하고 commit 해야한다.

### 기존 저장소를 Clone 하기

 - 다른 프로젝트에 참여하려거나(Contribute) Git 저장소를 복사하고 싶을 때 git clone 명령을 사용한다.  
 - **git clone** 명령어를 실행하면 프로젝트의 history를 모두 받아온다.


      git clone <url>
      git clone https://github.com/libgit2/libgit  


 - 위의 명령은 "libgit2” 라는 디렉토리를 만들고 그 안에 .git 디렉토리를 만든다.
 - 저장소의 데이터를 모두 가져와서 자동으로 가장 최신 버전을 Checkout 해 놓는다.

참고 GitBook : https://git-scm.com/book/ko/v2/Git%EC%9D%98-%EA%B8%B0%EC%B4%88-Git-%EC%A0%80%EC%9E%A5%EC%86%8C-%EB%A7%8C%EB%93%A4%EA%B8%B0