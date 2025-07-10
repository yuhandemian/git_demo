package com.codeit.ex02.list;

public class ListBasic1 {
  // https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
  // 컬렉션(Collection)이란?
  // - 컬렉션 자바에서 기본적으로 제공하는 자료구조와 알고리즘을 담당하는 library
  // - 사용자가 별도의 알고리즘을 구현하지 않고, 미리 구현된 구조를 재사용하여 활용
  // - 편리성도 좋지만, 내부적으로 알고리즘 효율도 좋음으로 웬만하면 컬렉션을 활용하는 것이 표준

  //    ArrayList - ★★★★★ 추천
  //     -> 필드에서는 주로 ArrayList '만' 사용하는데, (심지어 type으로 통일!!)
  //        이유는 DB에서 데이터를 담고 탐색 용도로 많이 활용하기 때문이다.
  //    - 장점 : 탐색속도가 빠르고, 메모리를 적게 차지한다.
  //    - 단점 : 삽입, 삭제, 수정이 느리다.

  //    LinkedList -> 일반적으로 활용하지 않고 stack, queue, deque으로 활용한다.
  //     -> 삽입 삭제가 빈번하지 않으면 사용하지 않음. -> 이럴 경우가 많이 없거나 다른 컬렉션(Map)을 사용함
  //    - 장점 : 삽입, 삭제, 수정이 빠르다.
  //    - 단점 : 탐색속도가 느리고, 메모리를 많이 차지한다. << 단순 list의 최악의 효율

  //    Vector
  //    -> Thread safe 할때 사용하나 일반적으로 그냥 list를 동기화시 활용할리 없다. 그냥 알아만 두자.

//  public static void main(String[] args) {
//    memberArray[0] = new Member("testID1", "김길동", 23, 60000.212);
//    memberArray[1] = new Member("testID2", "홍길동", 32, 53123.233);
//    memberArray[2] = new Member("testID3", "박길동", 25, 41212.322);
//  }
}
