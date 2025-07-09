package com.codeit.ex04.overloading;

// 메소드 오버로딩이란?
// - 같은 메서드(함수) 이름 이면서 다른 타입의 인자를 받아들이고 같은 기능을 동작하게끔 설계할 때 사용
// - 대표적인 예시는 System.out.println()이다.

//  메서드 오버로딩 규칙
//	  1. 메서드의 이름이 같아야한다.
//	  2. 매개변수의 갯수가 다르거나
//	  3. 매개변수의 Type(종류)가 다르거나
//	  4. 매개변수의 Type 순서가 다르거나
//	  5. 반환형은 무관하다. (return 을 하든 안하든 된다.)
//	  6. 변수명은 무관하다. (Type으로만 판단함!)

public class Overloading {

  // 기본형
  void myMethod(){
    System.out.println("myMethod 호출");
  }

  // 인자가 추가된 경우 -> OK
  void myMethod(int value){
    System.out.println("myMethod 호출, value : " + value);
  }

  // 리턴 type만 달라지는 경우 -> NG
  // 'myMethod(int)' is already defined in 'com.multi.ex04.overloading.Overloading'
//    int myMethod(int value){
//        System.out.println("myMethod 호출, value : " + value);
//        return value;
//    }

  // 인자가 많아 지는 경우 -> OK
  void myMethod(int val1, int val2){
    System.out.println("myMethod 호출, val1 : " + val1 + ", val2 : " + val2);
  }

  // 인자가 갯수는 같아도 type 다르면? -> OK
  void myMethod(String str){
    System.out.println("myMethod 호출, str : " + str);
  }

  // 오버로딩 설계 방법 -> 생성자, 일반 메서드 둘다 활용 가능
  // 1. 인자가 가장 많은 메서드로 기능 구현을 한다. ★주기능 메서드
  // 2. 적은 인자의 메서드를 오버로딩으로 구현하고, 인자가 가장 많은 메서드를 호출
  // 설계 이유 : 편리성, 코드 중복 제거, 인자가 적게 들어와도 문제 없다는 알리기 위한 설계

  // 최대 인자를 가지는 메서드 (총 3개), ★주기능 메서드
  public void print(String name, String age, String address){
    if(name == null || name.isEmpty()) { // null 체크 + 빈문자열 체크
      name = "홍길동";
    }
    if(age == null || age.isEmpty()){
      age = "20";
    }
    if(address == null || address.isEmpty()){
      address = "서울시 강남구 역삼동";
    }

    System.out.println(name + ", " + age + ", " + address);
  }

  // 인자 2개를 받아야하는 중복 코드가 많아지는 코드라 좋지 않다!!!
  // bad case!!!
//    public void print(String name, String age){
//        if(name == null || name.isEmpty()) { // null 체크 + 빈문자열 체크
//            name = "홍길동";
//        }
//        if(age == null || age.isEmpty()){
//            age = "20";
//        }
//
//
//        System.out.println(name + ", " + age);
//    }

  // 인자 2개 받는 print 메서드 설계 -> 오버로딩을 활용!!
  public void print(String name, String age){
    print(name, age, null); // 인자가 가장 많은 메서드 호출
  }

  // 인자 1개 받는 print 메서드 설계 -> 오버로딩 활용!!
  public void print(String name){
    print(name, null, null); // 인자가 가장 많은 메서드 호출
  }

  public static void main(String[] args) {
    System.out.println();
  }

}