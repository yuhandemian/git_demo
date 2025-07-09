package com.codeit.ex01.fisrt_object;

import java.util.Date;

//public class 클래스 당 하나만
public class FirstObject {
  public static void main(String[] args) {

  ////type 변수명 초기화문
    int value = 10;
    Member member = new Member();
    member.name = "홍길동";
    member.age = 20;
    member.address = "<UNK>";
    member.phonenumber = "123";
    Member member1 = member;
    member1.printALL();
  }


}


//default class(내부 클래스) : public class가 아닌 일반 class들이며, 외부에서는 접근 불

class Member{
  String name;
  int age;
  String phonenumber;
  String address;

  //멤버 메서드
  void printALL() {
    System.out.println("name = " + name +  "age = " + age +  "phonenumber = " + phonenumber + "address = " + address);

  }
}

class 회원{
  String 이름;
  int 나이;
  String 전화번호;
  String 주소;
}

class 고양이{
  String 이름;
  int 나이;
  String 종;
  String 울음소리;
  Date 최근산책시간;
}



