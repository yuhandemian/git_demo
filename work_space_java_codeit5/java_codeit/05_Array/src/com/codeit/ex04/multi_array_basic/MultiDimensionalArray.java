package com.codeit.ex04.multi_array_basic;

import org.w3c.dom.ls.LSOutput;

public class MultiDimensionalArray {

  public static void main(String[] args) {
    //다차원 배열 박복시는 index 키워드 i,j,k나 행렬 m,n을 활용

    // 1. 가장 기본적인 2차원 배열 활용법
    int[][] arr = new int[10][10];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {

        arr[i][j] = i * 10 + j;
        System.out.print(arr[i][j] + " " );
      }

      System.out.println();

    }
    System.out.println(("--------------------"));

  }
  //2. 2차원 가변형 배열 활용법 안녕하세요 반갑습니다. 저는 박유한입니다.
  //ㄴㅇㅁㄴ이ㅏㅓㅓㅏㅁㄹ아;ㅇㄴ러ㅏㅇ;ㅁ럼ㄴ알;ㅓㅁㄴㅇ;라ㅓㅁㄴ;아러ㅏ망러;아멀;ㅏㄴㅇ
}
