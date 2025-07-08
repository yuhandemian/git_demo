package com.codeit.ex01.array_basic.ArrayBasic;

import java.util.Arrays;

public class ArrayBasic {

  public static void main(String[] args) {

    System.out.println("배열 생성");

    int[] array = null;
    array = new int[10]; // 10개의 공간을 heap에 할당하는 발법 내부는 모두 0으로 초기화

    // 만일 new로 생성하지 않고 접근하면 java.lang.NullPointerException으로 죽는다.
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println("-----------------");

    array[0] = 0;
    array[1] = 1;
    array[2] = 2;

    for (int i = 0; i < array.length; i++) { //상수로 접근하는 방법 좋지 않다.
      array[i] = i;
      System.out.println(array[i] + " , ");

    }

    System.out.println();

    System.out.println("--------------------------");

    //배열 리터럴로 초기화하기
    System.out.println("2. 배열 리터럴로 생성하는 법");

    int[] array2 = new int[10];// 기본적인 배열 선언법
    int[] array3 = {1,2,3,4,5,}; //가장 간단한 리터럴 표기, 마지막, 있어도 문법 문제없음!
    int[] array4 = new int[]{1, 2, 3, 4, 5};
    //int[] array5 = new int[6]{1, 2, 3, 4, 5, 6}; // 크기지정시 에러남

    for (int i = 0; i < array3.length; i++) {
      System.out.println(array3[i] + " , ");
    }
    System.out.println();

    System.out.println("3.배열 응용 메서드");
    int[] array5 = new int[10];
    for (int i = 0; i < array5.length; i++) {
      array5[i] = i;
    }

        //배열 편하게 출력하는 방법

    System.out.println(array5); //[I@34a245ab
    String str = Arrays.toString(array5); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    System.out.println(str);
    System.out.println(Arrays.toString(array5));

    //문자배얄

    char[] charArray1 = new char[10];
    char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
    System.out.println(Arrays.toString(charArray1));

    String[] strArray = new String[10];
    String[] strArray2 = {"사과", "딸기", "<UNK>", "<UNK>" };
    System.out.println(Arrays.toString(strArray));

  }
}
