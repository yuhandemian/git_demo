package com.codeit.ex02.poly_exam;

public class _Run {

  public static void main(String[] args) {

    Car[] cars = new Car[5];
    cars[0] = new Car("BMW", 0);
    cars[1] = new Grandeur();
    cars[2] = new Sonata();
    cars[3] = new Avante();
    cars[4] = new BmwM5();

    for(Car car : cars) {
      printCar(car);

      // 만일 이자리에서 아반뗴의 닉네임을 출려갛고 싶다면??
      //ClassCastException 발생
    }
    //
  }

  // 차량의 정보를 출력하는 메서드
  //부모의 타입은 Car로 자식들 Type 대체할 수 있다.
  private static void printCar(Car car) {
    System.out.println(car.toString());
    car.move();// 동적바인딩 발생 코드
    //동적 바인딩이랑?
    // - 컴파일 시점(정적 상황)에 호출될 메소드를 특정하지 않고, 실행중(runtime) 도중 동적으로 호출될 메소드를 찾아 정해지는 메커니즘
    // - 이 시점에서는 부모의 move를 실행할지 자식의 move를 실행할지를 실시간으로 찾아서 정해준다.
    // Avante -> 부모의 move 실행
    // Sonata -> Sonata Class의 move 실행

    car.fueling();
    //각자의 닉네임을 출력하는 방법
    //instanceof : 객체의 type을 비교하여 동일한 type인지 학인하는 연산자, 반환은 boolean

    //type 가드

    if (car instanceof Avante) {
      Avante avante = (Avante) car;
      avante.avanteNickName();
      //한줄로
      ((Avante) (car)).avanteNickName();
    }

    //단축된 instaneceof 문
    if (car instanceof Sonata sonata) {
      sonata.sonataNickName();
    }
    if (car instanceof Grandeur grandeur) {
      grandeur.grandeurNickName();
    }
    if (car instanceof Sonata sonata) {
      sonata.sonataNickName();
    }
    if (car instanceof BmwM5 bmwM5) {
      bmwM5.nickName();
    }

    System.out.println();
  }
}
