package com.codeit.ex01.single_operator;

public class SingleOperator {
    public static void main(String[] args) {
        // 1. not(!) 연산자 : 논리값을 토글(Toggle)하는 용도로 활용
        boolean isTrue = true;

        System.out.println(isTrue); // true
        System.out.println(!isTrue); // false
        System.out.println(!!isTrue); // true

        isTrue = !isTrue;
        System.out.println(isTrue); // false
        System.out.println("-------------------------------------");


        // 2. 증감 연산자 ++ --, 전위증감연산자, 후위증감연산자
        //  -> Tip. 한줄에 하나씩쓰면 이해하기 쉽다.
        int num = 10;

        // 후위연산, 세미콜론 기준으로 뒤에서 더해진다.
        System.out.print("num++ : ");
        System.out.println(num++)/*(10)*/;/*(11)*/ // 출력 : 10
        System.out.print("num : ");
        System.out.println(num); // 11

        num = 10; // 초기화
        
        // 전위 연산, 자기를 먼저 더하는 연산을 시도하고 출력
        System.out.print("++num : ");
        System.out.println(++num);  // 출력 : 11
//        System.out.println((++num)); // 괄호 안이 먼저 실행!
        System.out.print("num : ");  // 출력 : 11
        System.out.println(num);

        num = 10; // 초기화
        
        // 후위 연산을 쓰지 않고 후위 연산 하는 방법
        System.out.print("num++ : ");
        System.out.println(num); // 10
        num = num + 1;
        System.out.print("num : ");
        System.out.println(num); // 11
        
        // 전위 연산을 쓰지 않고 전위 연산 하는 방법
        System.out.print("++num : ");
        num = num + 1;
        System.out.println(num); // 11
        System.out.print("num : ");
        System.out.println(num); // 11


        // 3. 부호 연산 +,-
        num = +10;
        System.out.println(num);
        num = -10;
        System.out.println(num);
    }
}






















