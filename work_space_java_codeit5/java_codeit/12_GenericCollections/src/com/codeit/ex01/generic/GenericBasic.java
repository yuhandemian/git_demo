package com.codeit.ex01.generic;

import java.util.Date;

public class GenericBasic {

  public static void main(String[] args) {
// Type을 정하지 않고 Object 배열 선언하는 경우의 문제점
    // 1. 지정된 Type이 아닌 다른 Type에 대한 Check가 항상 필요했다. instanceof
    // 2. 객체를 제대로 활용하기 위해선 casting 필요했다.
    Object[] array = new Object[10];
    array[0] = "abc"; // String
    array[1] = new Date(); // Date
    array[2] = (Object) 4; // Integer

    for(Object o : array) {
      if(o instanceof Date) {
        System.out.println("날짜 : " + o);
      } else if(o instanceof String)  {
        System.out.println("문자 : " + o);
        System.out.println(((String)o).toUpperCase());
      }
      else {
        System.out.println(o);
      }
    }


    //상위 문제를 해결하기 위해 제네릭 문법 활용!
    MyGenericArray<String> strArray = new MyGenericArray<String>(10);//1.7이전
    MyGenericArray<Integer> intArray = new MyGenericArray<>(10);
    MyGenericArray<Member> memberArray = new MyGenericArray<>(10);
    MyGenericArray objArray = new MyGenericArray<>(10); // Raw use of parameterized class
//
//    memberArray.add(new Member("test1", "홍길동", 21));
//    memberArray.add(new Member("test2", "김길동", 21));
//    memberArray.add(new Member("test2", "김길동", 21));
//    memberArray.add(5);





  }
}
