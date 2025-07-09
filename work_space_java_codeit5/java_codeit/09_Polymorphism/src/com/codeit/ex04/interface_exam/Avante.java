package com.codeit.ex04.interface_exam;

// There is no parameterless constructor availabe in 'com.multi.'

public class Avante extends HyundaiCar {

// 자동완성 생성자
//  public Avante(String name, int cc) {
//    super(name, cc);
//  }
  // 이름 없는 생성자 만들기
  public Avante() {
    //super(); -> 에러의 원인
  super("아반떼", 1600);// 부모의 인자 있는 생성자 호출
  }

  //오버라이드, alt 5, cmd + N

  public Avante(String name, int cc) {
    super(name, cc);
  }

  @Override
  public void fueling() {
    super.fueling();
  }


//자식 의 고유 메서드 -> 삭제
  public void avanteNickName() {
  }

  @Override
  public void nickName(){
    System.out.println("아방이");
  }


}

//    // 자식의 고유 메서드
//    public void avanteee{
//    }
