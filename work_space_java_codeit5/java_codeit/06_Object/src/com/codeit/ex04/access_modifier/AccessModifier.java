package com.codeit.ex04.access_modifier;

//접근제한자
public class AccessModifier {
  public int publicValue;
  protected int protectedValue; //상속시 부모 자선, 같은 패키지 내에서 활용 가능
  int defaultValue;// 같은 패키지 내에서만 활용 가능 default 안쓴다.
  private int privateValue; //자기 자신만 사용가능

  // 클래스 내부 필드 영역 = 자신의 영역

  public void myMethod() {
    publicValue = 42;
    protectedValue = 42;
    defaultValue = 42;
    privateValue = 42;

    System.out.println(" publicValue " + publicValue);
    System.out.println("protectedValue" + protectedValue);
    System.out.println(" defaultValue" + defaultValue);
    System.out.println("privateValue" + privateValue);

  }


}
