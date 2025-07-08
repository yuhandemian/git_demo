package com.codeit.ex03.branch;

public class BranchStatement1_my {
//  BranchStatement1
// 분기문 2가지
  // continue : 반복문에서 아래의 흐름을 스킵하고 위로 올라가는 문장 (단, 반복문은 끝나지 않고 다음 스탭으로 넘어감!)
  // break : 반복문을 벗어나는 문장 (끝나는 문장)

  // 반복문 분기를 종료 시키는 3가지 방법
  // break : 반복문이 종료되는 문장 -> 반복문은 끝나지만 반복문 아래 코드가 실행된다.
  // return : 반복문이 포함된 함수를 종료하는 문장 -> 함수 자체가 종료되는 문장
  // System.exit(0) : 프로그램 종료!, 권장하지 않음.
  public static void main(String[] args) {
    // 짝수가 아닌 31의 배수를 반복문으로 탐색하는 예제, 범위 : 1 ~ 1000
    // 총 10개가 찾아지면 10번째 수를 출력하고 끝낸다.

    int count = 0;
    for(int i = 1 ; i <= 1000 ; i++) {
      if(i%2==0){
        continue; //아래의 코드를 실행하지 않고, 증감식으로 이동하는 문장
      }
      // 홀수만 들어오는 영역
      if( i % 31 ==0){ //31의 배수일 떄
//        System.out.println(i);
        count++;
        if(count == 10){
          System.out.println(i);
//          break;
         // return;// 매서드를 종려하는 키워드
          System.exit(0);//프로그램 프로세스를 종료하는 키워드 , alt + ㄹ4

        }

      }
    }

    System.out.println("count :" + count);
  }

}
