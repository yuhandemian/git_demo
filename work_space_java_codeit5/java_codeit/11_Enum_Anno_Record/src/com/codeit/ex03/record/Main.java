package com.codeit.ex03.record;

public class Main {

  public static void main(String[] args) {
    Person p = new Person("홍길동", 21, "서울시 강남구");
    System.out.println(p.fullInfo());
    System.out.println(p.age());
    System.out.println(p.name());
    System.out.println(p.address());


  }
}