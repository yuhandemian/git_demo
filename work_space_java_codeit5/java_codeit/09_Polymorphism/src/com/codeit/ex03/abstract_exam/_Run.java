package com.codeit.ex03.abstract_exam;

public class _Run {

  public static void main(String[] args) {
    Car[] cars = new Car[4];
    // cars[0] = new Car();  /// 추상 클래스라 생성이 안돰
    cars[0] = new Avante();
    cars[1] = new Sonata();
    cars[2] = new Grandeur();
    cars[3] = new BmwM5();

    for (Car car : cars) {
      printCar(car);
    }
  }

  private static void printCar(Car car) {
    System.out.println(car.toString());
    car.move();
    car.fueling();

    if (car instanceof HyundaiCar hyundaiCar) {
      hyundaiCar.fueling();
      hyundaiCar.nickName();
    }

    if (car instanceof BmwM5 bmwM5) {
      bmwM5.nickName();
    }
    System.out.println();
  }
}
