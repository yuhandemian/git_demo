package com.codeit.ex04.logical_operator;

// 1=참, 0=거짓
// AND : 모두 참일때만 참
// OR : 하나라도 참이면 참

//  진리표
//    x y  AND OR
//  1 1   1  1
//  1 0   0  1
//  0 1   0  1
//  0 0   0  0

// 논리 연산자 = boolean type으로만 사용됨
public class LogicalOperator_1 {

  public static void main(String[] args) {

    boolean x = true;
    boolean y = true;
    boolean z = true;

    System.out.println(x && y);
    System.out.println(x || y);

    System.out.println(x && y &&z);
    System.out.println(x || y &&z); //AND가 OR보다 연산자 우선순위가 높다!
    System.out.println((x || y) &&z); // 만일 OR의 우선순위 상승을 위하선 괄호사용 별

    //비교 연산자, 숫자만 가능하다.
    int a = 100;
    int b = 50;

    System.out.println(a > b );

    System.out.println(!(a> b)); //이런 것도 가능하다.

    System.out.println("-------------------");


    //비교연산자 3개 비교하기

    a = 100;
    b = 50;
    int c = 70;

    //C 보다 A는 작고, C는 B보다 작음?

    // System.out.println( a > c > b) ;    안된다.  a >c 를 비교시 boolea typre이 된다.
    System.out.println((c < a) && (c < b));


  }
}

