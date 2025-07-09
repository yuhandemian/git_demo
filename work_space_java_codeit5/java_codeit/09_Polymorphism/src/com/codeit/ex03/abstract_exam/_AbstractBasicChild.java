package com.codeit.ex03.abstract_exam;

public class _AbstractBasicChild extends _AbstractBasic{

  @Override
  public void abstractMethod() {
    System.out.println("_AbstractBasicChild");
  }

  public static void main(String[] args) {
    _AbstractBasicChild basic = new _AbstractBasicChild();
    basic.abstractMethod();
  }

}
