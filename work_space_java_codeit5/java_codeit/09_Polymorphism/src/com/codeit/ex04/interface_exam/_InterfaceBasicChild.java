package com.codeit.ex04.interface_exam;

public class _InterfaceBasicChild implements _InterfaceBasic{

  @Override
  public void abstractMethod1() {
    System.out.println("InterfaceBasicChild.abstractMethod1" + STATIC_VALUE1);
  }

  @Override
  public void abstractMethod() {

  }

  @Override
  public void abstractMethod2() {
    System.out.println("InterfaceBasicChild.abstractMethod" + STATIC_VALUE2);
  }

  public static void main(String[] args) {
    _InterfaceBasicChild basic = new _InterfaceBasicChild();
    basic.abstractMethod1();
    basic.abstractMethod2();
    basic.defaultMethod();

  }
}
