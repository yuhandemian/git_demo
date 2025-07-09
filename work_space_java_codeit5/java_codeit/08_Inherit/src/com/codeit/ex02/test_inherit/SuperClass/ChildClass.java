package com.codeit.ex02.test_inherit.SuperClass;

public class ChildClass extends SuperClass {

  private int privateValue = 105;
  protected int protectValue = 110;
  public int publicValue = 120;
//
//


  public ChildClass() {
    super();
    System.out.println("ChildClass Constructor");

    int publicValue = 130;

    System.out.println("publicValue: " +this.publicValue;
    System.out.println("protectValue: " + this.privateValue);
    System.out.println("privateValue: " + this.privateValue);

    System.out.println("Super privateValue;" + getPricateValue());
    System.out.println("protectValue: " + super.protectValue);
    System.out.println("publicValue: " + publicValue);
  }


  @Override
  public void publicMethod(){


  }


  // 오버라이드 된
}
