package com.codeit.ex02.array_copy;

import java.util.Arrays;
import java.util.*;

public class ArrayCopy {

  //얕은 복사 : 주소지만 복사
  // 깊은 복사: 물리적 복사

  public static void main(String[] args) {
    //얕은 복사
    int[] array1 = {0, 1, 2, 3, 4, 5,};
    int[] array2 = array1;// 얕은 복사
    System.out.println("변경전 ");
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
    System.out.println("------");


    //깊은 복사 해보기

    System.out.println("깊은 복사");
    int[] array3 = {0, 1, 2, 3, 4, 5,};
    int[] array4 = null;

    //1. 고전적인 방법 = 직접 배열을 생성하고 반복으로 복사하낟.
    array4 = new int[array4.length];
    for (int i = 0; i < array3.length; i++) {
      array4[i] = array3[i];// 복사

    }

    array4[0] = 5;
    System.out.println("array3 : " + Arrays.toString(array3));
    System.out.println("array4 : " + Arrays.toString(array4));
    System.out.println(System.identityHashCode(array3));
    System.out.println(System.identityHashCode(array4));


    //중요!!  배열복사시 무난
    // 2. copyof
    array3 = Arrays.copyOf(array3, array3.length); // 전체 복사 할떄
    array3 = Arrays.copyOf(array3, 3); // 부분 복사 예시

    array4 = Arrays.copyOfRange(array3,0, array3.length); // range 복사

    array4[0] =5;
    System.out.println("array3 : " + Arrays.toString(array3));
    System.out.println("array4 : " + Arrays.toString(array4));

    //clone

    array4 = array3.clone();

    array4[0] =5;
    System.out.println("array3 : " + Arrays.toString(array3));
    System.out.println("array4 : " + Arrays.toString(array4));


    //4.기타 System.arraycopy(고전) -> 복잡해서 권장 X
    System.arraycopy(array3, 0, array4, 0, array3.length);

  }
}
