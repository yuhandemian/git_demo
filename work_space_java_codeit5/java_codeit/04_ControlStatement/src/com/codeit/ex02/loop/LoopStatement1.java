package com.codeit.ex02.loop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LoopStatement1 {
  public static void main(String[] args) {
//    myFirstWhileLoop();
  //  testWhileLoop();
    ///testSoWhileLoop();
    testForLoop();
    //testForLoop2();

  }


  /// static 메ㅓㅅ드

  public static void myFirstWhileLoop(){
    int count = 0;
    while (true){
      System.out.println("무한 반목분! count"+ count);

    }
  }

  private static void testWhileLoop() {
    //컴퓨터 시작점 =0,
    int i = 0; // 초기화문, i = index의 약자, 0부터 시작하는 것이 정석
    System.out.println("while 루프 시작");
    while (i < 10) { //조건절, 조건절이 참일 떄만 내부 문장을 실핼한다.
      System.out.println(i++);
    }

    //while문이 활용되는 케이스
    //1.무한루프(OS, 임베디드 시작점)
    //2. 끝이 정해지지 않은 탐색
    //3.iterator(반복자)의 탐색 패턴을 실핼할 때

    // 133의 3번째 배수는 무엇인가?, 탐색이 필요할 떄
    int count = 0;
    i = 0;
    while (true) {
      i++;
      if (i % 133 == 0) {
        count++;
        if (count == 3) {
          System.out.println(i);
          break;
        }
      }
    }

    //산술적 탐색
    System.out.println(133 * 3);

// doWhile은 잘 안쓴다.
    // doWhile은 최초 한번은 무조건 실행되는 반복문, 이후에는 조건절에 따라 실행 된다.
//    private static void testDoWhileLoop() {
//      int i = 0;
//      do {
//        System.out.println(i++);
//      } while (i < 10);
//      System.out.println("do-while문 끝!");
//
//      i = 100;
//      do {
//        System.out.println("최초 한번은 실행되는 문장!");
//      } while (i < 10);
//    }


  }


  //for문 : 개발자가 많이 사용하는 반복문 @@
  private static void testForLoop() {
    // 안외줘 지면 아래의 패턴을 손으로 외울때까지 쳐보는 것을 권장

    // 0부터 시작해서 9까지 돌고, 10은 도달하지 않는 for, 총 10번 반복
    // ++i, i++ 상관은 없는 데, 개발자들이 i ++ 를 선호 (c++)
    // 보통 증감하는 변수는 i , j, k  순으로 사용
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    System.out.println("for문 1 끝!");

    //패턴 1 -> 추천하지 않는 문법, i가 i부터 시작하는 문법
    //패턴 2 -> 항상 기본형을 만들고, 출력 할 때 i를 조절해서 출력하는 것을 권장

    for (int i = 0; i < 10; i++) {
      System.out.println(i + 1);

    }
  }


  private static void testForLoop2() {
    int[] array = {1, 2, 3, 4, 5};
    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
    Set<Integer> set = new TreeSet<>(List.of(1, 2, 3, 4, 5));
    for(int num : array) {
      System.out.println(num + " , ");

    }
    System.out.println();
  }




}
