package com.codeit.ex01.basic_inherit.BasicInherit;

import java.util.ArrayList;
import java.util.Date;

public class BasicInherit extends Object {
//Object는 모든 객체의 최상위 부모(Root)
  //-모든 클래스는 Object 클래스를 상속 받아 작성한 클래스이고, Object 상속은 문법적으로 생략하는 것이 원칙
  public static void main(String[] args) {
    //Object 활용 법: 모든 type을 대체할 수 있도록 활용 가능 ( 최상위 부모이기 떄문이다.)
    //부모(조상)의 type을 대체할 수 있도로 활용 가능
    Object obj1 = new Object();
    Object obj2 = new String();
    Object obj3 = new Date();
    Object obj4 = new BasicInherit();

    ArrayList list = new ArrayList();

    //getClass: 클래스의 다양한 정보 ( 시그니처, 메서드 이름, 메서드 개숫, 인자 갯수 등)을 알수 있는 class
    // -> 일반 프로그래밍 용도는 아니다. 리플랙션에 해당되는 기술

    System.out.println(obj1.getClass().getName());
    System.out.println(obj2.getClass().getName());
    System.out.println(obj3.getClass().getName());
    System.out.println(obj4.getClass().getName());

    //class의 부모 출력
    System.out.println(obj1.getClass().getSuperclass());// null -> root라서
    System.out.println(obj2.getClass().getSuperclass());//class java.lang.Object
    System.out.println(obj3.getClass().getSuperclass());
    System.out.println(obj4.getClass().getSuperclass());

    //type casting: 부모의 type을 사용한 변수는 다시 자식 type으로 변환하는 방법
    //Object -> Date


    // 잘못된 type casting을 하면 java.lang.ClassCastException
    Date date = (Date) obj3;
    System.out.println(date.getTime());
    System.out.println(((Date)obj3).getTime());
    Date date2 = (Date) obj4;
    System.out.println(date2.getTime());

  }
}
