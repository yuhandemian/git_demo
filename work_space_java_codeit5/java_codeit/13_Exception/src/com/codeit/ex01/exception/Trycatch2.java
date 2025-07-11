package com.codeit.ex01.exception;

import java.io.IOException;

public class Trycatch2 {
  public static void main(String[] args) {

    try {

        System.out.println("예외가 발생");
        if (true) {
          throw new Exception("사용자 예외");
        }

        System.out.println("예외가 발생하지 않은 문장");
      } catch (IOException e) {

      }
     catch (Exception e) {
       System.out.println("예외처리완요");
       return;
    } finally {
      //try-catch문 이후에 반드시 동작해야하는 코드가 있는 경우에 작성(close)
      //만일 try에서 예외가 발생해도 반드시 finally가 실행됨
      //return문이 있어도 finally 동작
      System.out.println("final");
      System.out.println("예외의 발생 여부 관계 없이 무조건 진입되는 공간");
    }
    System.out.println("main"); // 출력안된다. return 떄문에..

    //cmd option t  -> 자동



  }
}
