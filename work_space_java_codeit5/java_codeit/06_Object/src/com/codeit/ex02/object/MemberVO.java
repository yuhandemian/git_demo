package com.codeit.ex02.object;
// VO (Value Object)
// - 값 자체를 표현하는 불변 객체로, 생성 이후 상태가 변하지 않는다. final 멤버변수 + 생성자 + getter + 사용자 정의 메서드
// - final 필드와 생성자만으로 값이 설정되며 setter는 제공하지 않는다.

// VO 빠르게 만드는 방법! ★★★★★
// Step1. 객체에서 사용할 멤버변수를 선언한다. final과 접근제한자 private로 통일한다.
// Step2. alt + insert 혹은 우클릭 -> Generate를 클릭하여 필요한 코드를 자동생성한다.
//         생성자, 필드 있는 생성자, getter, toString 생성한다!


public class MemberVO {

  private final String name;
  private final int age;
  private final String phoneNum;
  private final String address;

  public MemberVO(String name, int age, String phoneNum, String address) {
    this.name = name;
    this.age = age;
    this.phoneNum = phoneNum;
    this.address = address;

  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPhoneNum() {
    return phoneNum;
  }

  public String getAddress() {
    return address;
  }


}

