package com.codeit.ex04.access_modifier;

public class TestAccessModifier {

  public static void main(String[] args) {
    AccessModifier accessModifier = new AccessModifier();
    accessModifier.publicValue = 1;
    accessModifier.protectedValue = 2;
    accessModifier.defaultValue = 3;
    //accessModifier.privateValus =4; // 접근 분가

    accessModifier.myMethod();

  }

}
