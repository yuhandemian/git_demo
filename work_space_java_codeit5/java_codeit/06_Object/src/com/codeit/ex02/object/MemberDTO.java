package com.codeit.ex02.object;
// DTO (Data Transfer Object)
// - 계층 간 데이터 전달을 목적으로 사용하는 객체로, 값의 변경이 가능하다.
// - 주로 getter와 setter를 가지고 있고 사용자 로직을 담지 않는다.

import java.util.Objects;

// DTO 빠르게 만드는 방법! ★★★★★
// Step1. 객체에서 사용할 변수를 선언한다. 접근제한자 private로 통일한다. 올바른 타입을 활용
// Step2. alt + insert 혹은 우클릭 -> Generate를 클릭하여 필요한 코드를 자동생성한다.
//         생성자, 필드 있는 생성자, getter/setter, toString 생성한다!
public class MemberDTO {
  private String name;
  private int age;
  private String phoneNum;
  private String address;

  //생성자 여러개가 가능하다.

  public MemberDTO(String name1, int age1, String phoneNum1, String address1) {

  }

  public MemberDTO(int age) {
    this.name = name;
    this.age = age;
    this.phoneNum = phoneNum;
    this.address = address;
  }

  public MemberDTO() {

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

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberDTO memberDTO = (MemberDTO) o;
    return age == memberDTO.age && Objects.equals(name, memberDTO.name)
        && Objects.equals(phoneNum, memberDTO.phoneNum) && Objects.equals(address,
        memberDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, phoneNum, address);
  }


//이 방식은 뭔장하지 않는다. 나쁜코드, concat(+)
//  @Override
//  public String toString() {
//    return "MemberDTO{" +
//        "name='" + name + '\'' +
//        ", age=" + age +
//        ", phoneNum='" + phoneNum + '\'' +
//        ", address='" + address + '\'' +
//        '}';
//  }

  //StringBuilder를 써야한다.


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("MemberDTO{");
    sb.append("name='").append(name).append('\'');
    sb.append(", age=").append(age);
    sb.append(", phoneNum='").append(phoneNum).append('\'');
    sb.append(", address='").append(address).append('\'');
    sb.append('}');
    return sb.toString();
  }



}
