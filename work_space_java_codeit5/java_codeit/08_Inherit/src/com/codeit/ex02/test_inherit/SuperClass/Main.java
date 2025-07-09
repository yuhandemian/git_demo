package com.codeit.ex02.test_inherit.SuperClass;

public class Main {
  public static void main(String[] args) {
    System.out.println("부모 클래스 생성 시작!");
    new SuperClass();
    System.out.println("부모 클래스 생성 끝!");

    System.out.println("자식 클래스 생성 시작!");
    new ChildClass();
    System.out.println("자식 클래스 생성 끝!");
  }
}
