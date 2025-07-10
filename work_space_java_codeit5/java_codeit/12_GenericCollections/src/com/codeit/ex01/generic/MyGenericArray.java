package com.codeit.ex01.generic;

//제네릭 기반 배열 Class
public class MyGenericArray <T> {// T는 약속된 문자로, 아무 문자나 가능, 2글자 이상도 가능
  // public class MyGenericArray <T1, T2>


  // 제네릭이란? Type을 사용자가 외부에서 주입(injection) 시켜 정의하는 문법
  // T는 Type의 약자로 활용, <T>로 외부에서 타입을 주입시켜 내부에 Type으로 대체된다.
  // T는 정해져 있지 않은 상태에서 미리 프로그래밍이 가능하고, 'T'로 안해도 되고 사용자가 정해도 된다.

  private final Object[] array;
  private int index = 0;

  public MyGenericArray(int size) {
    array = new Object[size];
  }

  public int add(T item){ //여기서의 T는 미리 정해진 T
    if (index > array.length) {
      return -1;
    }
    array[index++] = item;
    return index;
  }

  @SuppressWarnings("unchecked")
  public T get(int index) {
    if (index < 0 || index >= array.length) {
      return null;
    }
    return (T) array[index];
  }
}
