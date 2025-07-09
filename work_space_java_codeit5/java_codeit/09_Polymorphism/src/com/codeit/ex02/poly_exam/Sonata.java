package com.codeit.ex02.poly_exam;

public class Sonata extends Car {

  public Sonata() {
    super("소나타", 2000);

  }

  @Override
  public void fueling() {
    System.out.println("휘발유");

  }

  @Override
  public void move() {
    System.out.println("소나타 부르ㅡㄹㅇ");
  }

  //고유 메서드

  public void sonataNickName() {
    System.out.println("소나 타는 차");
  }
}
