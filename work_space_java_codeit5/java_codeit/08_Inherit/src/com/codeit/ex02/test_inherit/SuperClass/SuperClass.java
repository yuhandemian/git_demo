package com.codeit.ex02.test_inherit.SuperClass;

public class SuperClass {

private  int pricateValue =5;
protected  int protectValue = 10;
public int publicValue = 20;

//부모의 생성자

  public SuperClass() {
    System.out.println("SuperClass default Constructor 호출되었습니다. ");
  }

  public void publicMethod() {
    System.out.println("SuperClass publicMethod 호출 ");

  }

  public int getPricateValue() {
    return pricateValue;
  }

  public void setPricateValue(int pricateValue) {

  }
}
