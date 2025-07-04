package com.codeit;
// 패키지명 : 폴더 구분 또는 소스 코드 그룹핑 용도
// - 폴더에 들어가는 이름은 모두 소문자!
// - 마지막 Class 명은 첫글자는 대문자로 시작하는 카멜표기법으로 표기
// - 패키지명은 보통 회사명 + 프로젝트 별칭으로 구성된다.
// com.codeit.myproject.view.MyView
// com.codeit.myproject.model.MyDataVO

//주석 사용법
// - 주석은 코드를 설명하는 문장으로 컴파일 대상이 아님.
// - 최근에는 주석을 코드에서 모두 제거하고 형상관리를 요구함
// - 단, 학습용으로는, 사용하길 권장!!!
//1. //로 시작하는 한줄 주석
//2. /* */ : 주석의 시작과 끝
//3. 단축키 (cmd + /)를 활용 shift + 위 아래 화살표

// 한줄 주석
/*
*  여러줄 주석
*  여러줄 주석
*  여러줄 주석
* */

// javadoc 주석 - > 프로그램 문서를 자동으로 만들어주는 도구


/**
 * @apiNote :
 * @
 */

// class 이름을 지칭하는 곳 'public class'의 이름이 파일명과 일치해야한다.
//-> 일치하지 않으면 에러 발생!
// 빨간줄 -> 컴파일 에러
//class 이름을 바꾸고 싶다면 Shift + F6 추천!

public class MyFirstClass {
// main : 프로그램의 시작 경로 - > c언어의 진짜 main이 아닌  JVM이 실행시켜주는 위치

  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}


// 자주 사용하는 단축키 모음 ★★★★★

// 필수적인 기본 단축키들 (외워라!!)
// shift + shift (Mac 동일) : search everywhere, 모든 탐색기(명령어, 파일, 키워드)
// ctrl + ctrl (cmd + cmd) : cmd 명령어 호출창 열기
// alt + enter (option + enter) : quick fix(에러 자동 고치기)
// tab (Mac 동일) : 들여쓰기 또는 자동완성
// shift + tab (Mac 동일) : 역들여쓰기
// ctrl + space (Mac 동일) : 자동완성
// ctrl + shift + space (Mac 동일) : 스마트 자동완성 추천
// ctrl + / (cmd + /) : 주석 자동완성
// ctrl + shift + / (cmd + option + /) : 여러줄 주석 자동완성
// ctrl + a (cmd + a) : 모든 라인 선택
// ctrl + w (option + ↑) : 확장된 선택, 입력할수록 범위 커짐
// ctrl + d (cmd + d) : 라인 복사
// ctrl + y (cmd + delete) : 선택된 라인지우기
// ctrl + z (cmd + z) : 되돌리기 (undo)
// ctrl + shift + z (cmd + shift + z) : 다시 실행하기 (redo)
// ctrl + ↑, ↓ (cmd + ↑, ↓) : 커서 기준으로 화면이동
// ctrl + <-, -> (option + ←, →) : 키워드 이동, 빠르게 이동 가능 (Home, End 키 활용 추천!)
// alt + ↑, ↓ (cmd + ↑, ↓) : 위아래로 코드 이동 빠르게 하기 (메소드, 클래스 단위)
// alt + <-, -> (cmd + option + ←, →) : 코드 파일간 이동
// alt + shift + ↑ (option + shift + ↑) : 선택된 라인 위로 옮기기
// alt + shift + ↓ (option + shift + ↓) : 선택된 라인 아래로 옮기기
// ctrl + alt + t (cmd + option + t) : if, for, try-catch문 자동생성 ★★★★
// 탐색 (find)
// ctrl + f (cmd + f) : 파일 내에서 키워드 찾기 -> replace로 교체 가능
// ctrl + r (cmd + r) : replace 상태에서 열기
// 단어가 선택된 상태에서 ctrl + f (cmd + f) : 선택된 단어 찾기
// ctrl + shift + f (cmd + shift + f) : 프로젝트 또는 전체 찾기
// ctrl + shift + r (cmd + shift + r) : 프로젝트 또는 전체 교체
// shift + shift (Mac 동일) : 모든 찾기 모드
// shift + f3 (Mac 동일) : 이전 찾기
// f3 (Mac 동일) : 다음 찾기
// 리팩토링
// ctrl + alt + l (cmd + option + l) : 정해진 포멧으로 자동 정렬
// ctrl + shift + enter (cmd + shift + enter) : 세미콜론 자동완성
// alt + shift + insert (Cmd + Option + 8) : 열선택 모드 전환
// alt + shift + click (option + shift + click) : 단어 선택 모드로 전환
// shift + f6 (Mac 동일) : rename (변경된 이름은 다른 파일에서도 올바르게 변경됨)
// ctrl + shift + u (cmd + shift + u) : 대소문자 변환
// ctrl + alt + shift + t (ctrl + t) : 리팩토링 모드화
// ctrl + alt + v (cmd + option + v) : extract variable
// ctrl + alt + m (cmd + option + m) : extract method
// ctrl + alt + f (cmd + option + f) : extract field
// ctrl + alt + shift + u (cmd + option + u) : UML 클래스 다이어그램
// alt + insert (cmd + n or cmd + insert) : generate 단축키 -> get/setter, toString 자동완성용

// 생성자 자동완성 참고 : https://dololak.tistory.com/562
