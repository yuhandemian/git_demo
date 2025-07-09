package com.codeit.ex04.interface_exam;

public class _Run {

  public static void main(String[] args) {
    Car[] cars = new Car[5];
    // cars[0] = new Car();  /// 추상 클래스라 생성이 안돰
    cars[0] = new Avante();
    cars[1] = new Sonata();
    cars[2] = new Grandeur();
    cars[3] = new BmwM5();
    cars[4] = new TeslaModel3();

    for (Car car : cars) {
      printCar(car);
    }
  }

  private static void printCar(Car car) {
    System.out.println(car.toString());
    car.move();
    car.fueling();

    //내연기관차와 전기차 구분
    if (car instanceof ElectricType electricCar) {
      electricCar.charge(); // 전기차 충전
    } else {
      car.fueling();
    }

    if (car instanceof HyundaiCar hyundaiCar) {
      hyundaiCar.fueling();
      hyundaiCar.nickName();
    }

    if (car instanceof BmwM5 bmwM5) {
      bmwM5.nickName();
    }

    if(car instanceof OverseasType overseasCar) {
      overseasCar.printOrigin();
      System.out.println(overseasCar.getOrigin()+ "에서 수입 되었습니다");
    }

    System.out.println();
  }
}
