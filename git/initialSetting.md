## Git 최초 설정

### 사용자 정보   

Git을 설치하고 나서 가장 먼저 해야 하는 것은 **사용자이름과 이메일 주소를 설정**하는 것이다.  
Git은 커밋할 때마다 이 정보를 사용한다. 한 번 커밋한 후에는 정보를 변경할 수 없다.  

    git config --global user.email "email"  
    git config --global user.name "userName"  

<div style="text-align:center;font-size:13px">사용자의 이름과 이메일 주소를 입력한다.</div>

    git config --list

git push origin main : 파일을 push 한다.  
git checkout 'commitId' : 원하는 시점으로 파일을 되돌린다.  
git checkout 'branch' : 원하는 branch로 돌아간다.  
git remote add origin 'address' : 로컬저장소에 원격저장소 주소를 알려준다.  
git clone 'address.git' : 로컬저장소에 원격저장소 파일 복사  
git clean -f : 추적되지 않는 파일 제거  
git reset HEAD^ : 이전 커밋을 삭제한다.


**기본 Branch 변경**  
git config --global init.defaultBranch main
- **Git 사용할 폴더 생성**
    - mkdir 폴더이름
- **생성한 폴더를 git이 관리하도록 설정**
    - git init
- **.gitignore**
    - Git의 관리에서 특정 파일/폴더를 배제해야 할 경우
        - **포함할 필요가 없을때**<br>
          자동으로 생성 또는 다운로드 되는 파일들(빌드 결과물, 라이브러리)
        - **포함하지 말아야 할때**<br>
          보안상 민간함 정보를 담은 파일
        - **.gitignore 파일을 사용해서 배제할 요소들을 지정 할 수 있다.**
        - **.gitignore 파일생성**
    - .gitignore 형식<br>
      https://git-scm.com/docs/gitignore 참조


### commit
- git add "fileName" : commit 할 파일을 추가
- git commit -m "message" : 파일을 commit 한다 -m은 메시지를 뜻한다.

### push


### Reset
작업취소
- git reset --soft HEAD^

### branch
- git branch "branch_name" : 새로운 브랜치를 생성한다.
- git status : 작업한 파일 목록 확인
- git diff : 기존파일의 변경 내역 확인
- git clone "uri" : 파일을 복사한다.

y - stage this hunk
n - do not stage this hunk
q - quit; do not stage this hunk or any of the remaining ones
a - stage this hunk and all later hunks in the file
d - do not stage this hunk or any of the later hunks in the file
g - select a hunk to go to
/ - search for a hunk matching the given regex
j - leave this hunk undecided, see next undecided hunk
J - leave this hunk undecided, see next hunk
k - leave this hunk undecided, see previous undecided hunk
K - leave this hunk undecided, see previous hunk
s - split the current hunk into smaller hunks
e - manually edit the current hunk
? - print help


  
  