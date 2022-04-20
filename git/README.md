# Git 설정 및 명령어
## Git 최초 설정 

git config --global user.name "userName"  
git config --global user.email "email"  


git add "fileName" : commit 할 파일을 추가  
git commit -m "message" : 파일을 commit 한다 -m은 메시지를 뜻한다.  
git push origin main : 파일을 push 한다.  
git checkout 'commitId' : 원하는 시점으로 파일을 되돌린다.  
<<<<<<< HEAD
git checkout 'branch' : 원하는 branch로 돌아간다.  
=======
git checkout 'branch' : 원하는 branch로 돌아간다.


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

###**commit**
commit -m "msg"

### push


### Reset
작업취소
git reset --soft HEAD^ : 최근 커밋을 하기 전 상태로 작업트리 되돌리기  
git reset --mixed HEAD^ : 최근 커밋과 스테이징을 하기 전 상태로 작업트리 되돌리기(기본옵션)  
git reset --hard HEAD^ : 최근 커밋과 스테이징, 파일 수정을 하기 전 상태로 작업트리 되돌리기(복구 불가능)


git status 작업한 파일 목록 확인
git diff 기존파일의 변경 내역 확인
git add
git clone "uri" 파일을 복사한다

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


  
  