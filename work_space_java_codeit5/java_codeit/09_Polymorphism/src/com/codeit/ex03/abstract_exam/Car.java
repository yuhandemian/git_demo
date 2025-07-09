package com.codeit.ex03.abstract_exam;

// 추상 클래스화
// -> 최상위 부모는 생성하지 못하도록 abstract class화


public class Car {

  //공통으로 사용할 멤버 변수
  protected String name;
  protected int cc;

  //default 생성자를 쓰지 않고 초기화가 필요한 데이터는 생성자 매개변수로 받는다.
  public Car(String name, int cc) {
    this.name = name;
    this.cc = cc;
  }

  //공통기능 1. 주유기능
  public void fueling(){
    System.out.println("주유중입니다.");
  }

  //공통기능 2. 움직이는 기능
  public void move() {
    System.out.println("부릉부릉.");
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Car{");
    sb.append("name='").append(name).append('\'');
    sb.append(", cc=").append(cc);
    sb.append('}');
    return sb.toString();
  }

}
