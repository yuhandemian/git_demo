package com.codeit.ex04.interface_exam;

public abstract class HyundaiCar extends Car {

  //현대자동차의 공통적인 필드
  protected String serviceName = "블루헨즈";

  public HyundaiCar(String name, int cc) {
    super(name, cc);
  }

  //일반 메서드 : 공통적인 기능을 구현할 떄 사용
  public void service() {
    System.out.println("<UNK>" + serviceName + "<UNK>");
  }

  //추상 메서드
  abstract public void nickName();

}
