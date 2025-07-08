package com.codeit.ex02.loop;

public class LoopStatement3_GooGooDan{
  //    2 X 1 = 2
//  2 X 2 = 4
//  2 X 9 = 18 ...
//    3 X 1 = 3
//    3 X 2 = 6 ...
  public static void main(String[] args) {
    //구구단은 이차원 for 문으로 구성하는 것이 쉽다.
    //Step1. 2단 for문을 기계적으로 완성 , 1차 for문은 i , 2차 for문은 j로 완성한다.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println(i + "X" + j + " = " + (i * j));
      }
    }
//Step2. 출력으 랗고 i와 j의 시작점과 끝점을 조절하여 구구단을 완성한다.

    for (int i = 2; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.println(i + "X" + j + " = " + (i * j));

      }
    }

    //Step3. 중첩된 반복문 앞뒤로 공간이 있다는 것을 활용하자 (데코레이션)

    for (int i = 2; i < 10; i++) {
      System.out.println("-----------" + i + "단시작-----------");
      for (int j = 0; j < 10; j++) {
        System.out.println(i + "X" + j + " = " + (i * j));

      }

      System.out.println("----------------------");
    }

  }
}
