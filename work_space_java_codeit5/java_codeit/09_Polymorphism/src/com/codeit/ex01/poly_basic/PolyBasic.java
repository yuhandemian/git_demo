package com.codeit.ex01.poly_basic;

// 다형성이란?
// -> 부모의 타입으로 자식의 타입을 대체할수 있는 개념, 부모의 type으로 배열을 선언하여 자식을 담을수 있다.

import java.math.BigDecimal;
import java.util.Date;

public class PolyBasic {

  public static void main(String[] args) {
    Object[] objArray = new Object[5]; // java의 만능주머니
    // 다형성 속성을 통해 모든 객체는 Object Type으로 대체 될수 있다.
    // 가능한 이유 : the root of the class hierarchy, 최상위 부모이기 때문에

    objArray[0] = new Object();
    objArray[1] = "hello";
    objArray[2] = new Date();
    objArray[3] = new BigDecimal("2123123123123.12312");
    objArray[4] = 5; // auto boxing - java 1.5 이후 가능한 문법
    objArray[4] = (Integer)5; // boxing : 기본형과 참조혀이간 타입변환
    objArray[4] = new Integer(5); // Interger(int) 는 9이상에서 지원중단

    for(Object obj : objArray) {
      //Object의 toString을 오버라이드한 자식의 toStirng을 호출하는 과정 = 동적바인딩
      System.out.println(obj.toString());

    }

    //오버라이드 된 toSring 결과물
    //java.lang.Object@4e50df3e


  }

}
