package com.codeit.ex01.conditional;

import org.w3c.dom.ls.LSOutput;

// if 문법 정리
// if (조건식1) {
//    (조건식1이 참이면 실행되는 문장)
// }
// else if (조건식2){
//    (조건식2가 참일때 실행되는 문장)
// }
// .... (else if문이 더 붙을수 있다!)
// else {
//    (모든 조건이 해당되지 않을때 실행되는 문장)
// }
//
// 조합1 : if
// 조합2 : if - else
// 조합3 : if - else if - else
// 조합4 : if - else if
public class IfStatement1 {

  public static void main(String[] args) {
    int a = 5;

    if (a == 5) {
      System.out.println("5입니다.");

    }
    //중괄호 없어 되지만, 코딩 컨벤션에서는 있는 것을 권장.

    if (a % 2 == 0) {
      System.out.println("짝수 입니다.");
    } else {
      System.out.println("홀수 입니다.");
    }

    //if -else문의 c언어 스타일, 권장 x

    if( a % 2 == 0)
    {
      System.out.println("<UNK> <UNK>.");
    }
    else
    {
      System.out.println("<UNK> <UNK>.");
    }

    // else 역시 중괄호가 없이 if문으로 활용 가능하다, 권장하지 않는다!
    if (a % 2 == 0)
      System.out.println("짝수입니다.");
    else
      System.out.println("홀수입니다.");
    System.out.println("a는 홀수가 맞습니다!");


  }
}
