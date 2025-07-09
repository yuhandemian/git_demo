package com.codeit.ex03.run;

import com.codeit.ex02.object.Member;
import com.codeit.ex02.object.MemberDTO;
import com.codeit.ex02.object.MemberVO;

//실행 클래스
public class Main {

  public static void main(String[] args) {
    //멤버 객체 실습 공간

    Member member = new Member();

    System.out.println("Member default 값 출력");
    System.out.println(member.name);
    System.out.println(member.age); // 0, JVM 초기화
    System.out.println(member.address);
    System.out.println(member.phone); // null, JVM 초기화
    System.out.println("-----------------");

    //멤버 변수/ 메서드 접근하는 연산자.(dot)
    member.name = "홍길동";
    System.out.println(member.name);
    member.sayHello();
    System.out.println("---------------");

    //getter / setter 활용법
    //getter, setter은 카멜표기
    member.setName("김길동");
    System.out.println(member.getName());
    System.out.println("---------------");

    //이름하고 주소를 동시에
    //me("박길동", "서울시 강남구");
    System.out.println(member.getName());

    //set and get
    //String

    //return this에서 this에 long 주소지 , long 주소지는 숨겨짐

    //MemberDTO 실습
    String name1 = "";
    MemberDTO memberDTO = new MemberDTO(name1, age1, phoneNum1, address1);
    System.out.println(memberDTO.getName());
    System.out.println(memberDTO.getAge());
    System.out.println(memberDTO.getAddress());
    System.out.println(memberDTO.getPhoneNum());
    System.out.println("---------------");

    memberDTO = new MemberDTO();
    System.out.println(memberDTO.toString());
    System.out.println(memberDTO);

    System.out.println("---------------");

    name1 = "김길동";
    int age1 = 21;
    String address1 = "<UNK>";
    String phoneNum1 = "010_1234_5678";
    //자동완성으로 잘 채워준다.

    memberDTO = new MemberDTO(name1, age1, phoneNum1, address1);
    System.out.println("----");

    // 객체 배열

    MemberVO[] myArray = new MemberVO[5];
    myArray[0] = new MemberVO(name1, age1, phoneNum1, address1);
    myArray[1] = new MemberVO(name1, age1, phoneNum1, address1);
    myArray[2] = new MemberVO(name1, age1, phoneNum1, address1);
    myArray[3] = new MemberVO(name1, age1, phoneNum1, address1);
    myArray[4] = new MemberVO(name1, age1, phoneNum1, address1);
    for (int i = 0; i < myArray.length; i++) {
    }
  }
}
