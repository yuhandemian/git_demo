package com.codeit.ex04.interface_exam;

//Car, 전기차, 해외차
public class TeslaModel3 extends Car implements OverseasAndElectricType {

  public TeslaModel3() {
    super("테슬라 모델3", 175);
  }

  @Override
  public void fueling(){
    charge();
  }

  @Override
  public void charge() {
    System.out.println("충전");
  }

  @Override
  public String getOrigin() {
    return "china";
  }
}
