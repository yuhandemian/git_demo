package com.codeit.ex04.interface_exam;

//전기차임을 알리는 인터페이스
public interface ElectricType {

  //차량의 연료 type
  String GAS_TYPE = "전기";

  //추상메서드
  void charge(); //충전 가능


}
