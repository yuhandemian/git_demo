package com.codeit.ex02.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListBasic3 {

  public static void main(String[] args) {
// 2. 객체 커스텀 정렬 활용하기 ★★★★★
    // - 기본형이 아닌 경우 Comparator, Comparable을 통해 정렬할수 있다.
    // - Java8 이후 lambda 문법을 통해 간략화(?) 되었다.
    List<Member> list = new ArrayList<>();
    list.add(new Member("TestID3", "홍길동3", 44, 11110.1));
    list.add(new Member("TestID4", "홍길동", 21, 143.1));
    list.add(new Member("TestID2", "홍길동2", 22, 100.1));
    list.add(new Member("TestID5", "최길동", 32, 4400.1));
    list.add(new Member("TestID6", "홍길동", 25, 10550.1));
    list.add(new Member("TestID7", "홍길순", 21, 10550.1));
    list.add(new Member("TestID8", "홍길동", 25, 20550.1));
    list.add(new Member("TestID1", "김길동", 25, 10550.1));

    System.out.println("\n정렬 이전!");
    list.forEach(System.out::println);
    System.out.println("---------------------------------------------------------");




    // 2) Comparator를 통해 정렬하는 방법 ★★★★★
    // - 장점 : 다양한 기준으로 정렬이 가능하다.
    // - 단점 : 문법이 어렵다. -> 람다로 외우면 할만하다.

    System.out.println("나이순 정렬 시키기");
    // list.sort() 사용법
    // - 고전(1.6)으로 익명 클래스를 통해 Comparator를 구현하는 방법, 외우기 어렵다! 비추!
    list.sort(new Comparator<Member>() {
      @Override
      public int compare(Member o1, Member o2) {
        // 커스텀 정렬 구현부
//                return (x < y) ? -1 : ((x == y) ? 0 : 1);
        return Integer.compare(o1.getAge(), o2.getAge()); // o1->o2 오름차순, 정방향
//                return Integer.compare(o2.getAge(), o1.getAge()); // o2->o1 내림차순, 역방향
      }
    });
    list.forEach(System.out::println);
    System.out.println("---------------------------------------------------------");

    System.out.println("이름순 정렬하는 방법");
    Collections.sort(list, new Comparator<Member>() {
      @Override
      public int compare(Member o1, Member o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
    list.forEach(System.out::println);
    System.out.println("---------------------------------------------------------");


// 4. Stream(=데이터 처리 용도, Java8 이상)을 통한 정렬
    // - 람다식중 하나인 Stream 문법을 통해 정렬하는 방법
    // - parallel를 활용하면 병렬처리 되어 매우 빠르게 정렬된다고 한다.
    System.out.println("나이순으로 정렬");
    List<Member> newList1 = list.stream()
        .sorted(Comparator.comparingInt(Member::getAge))
        .toList();
    newList1.forEach(System.out::println);
    System.out.println("---------------------------------------------------------");
    // parallel 활용 문법
    List<Member> newList2 = list.stream().parallel()
        .sorted(Comparator.comparingInt(Member::getAge))
        .toList();
    newList2.forEach(System.out::println);
    System.out.println("---------------------------------------------------------");

  }


}
