package com.codeit.ex03.abstract_exam;
// Abstract Class(추상 클래스)란?
// - 객체지향 설계를 위해 상속 전용으로 상위(부모) class를 정의 하는 문법으로 Type으로 활용된다.
// - 추상 클래스는 생성(new)할수 없으며 오직 상속(extends)으로만 활용 가능
// - 역시 다중상속 할수 없으며, 다중 상속이 필요한 경우 interface를 활용
// - 일반적인 Class의 기능을 모두 활용할수 있다. (생성자, 멤버변수, 메소드 구현 등)
// - abstract 메소드 선언 가능하며 몸통이 없는 메소드로 오버라이드를 통해 반드시 자식에서 구현해야한다.
//   -> 자식에서 특정 메소드 생성을 강제화 할때 활용한다.
// - Abstract Class             vs Interface
//   반조립 상태(이미 구현이 70%)       설계를 강요할때 활용 (실제 거의 기능 X)

// 추상 클래스
public abstract class _AbstractBasic {

  // 추상클래스 공통 필드
  public String value1;
  public String value2;

  //필요하면 생성자도 만들수 있고
  _AbstractBasic() {}

  //일반 메서드도 존재 가능
  public void method() {
    System.out.println("method called");
  }

  // 추상 메서드 : 몸통을 가지지 않고, 상속 받은 자식이 강제로 구현할 메서드
  public abstract void abstractMethod();

}
