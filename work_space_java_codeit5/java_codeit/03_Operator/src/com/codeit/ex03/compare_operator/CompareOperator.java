package com.codeit.ex03.compare_operator;


// 비교 연산자
public class CompareOperator {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        // 비교연산자 사용
        System.out.println(a == b); // 같은가? -> 아니요(false)
        System.out.println(a != b); // 같지 않은가? -> 예(true)
        System.out.println("---------------------------------------");


        // 문자열 비교 ※ 주의: 이해하기 어렵다. 그래서 외워라!
        // -> (외울 내용)상식 : 비교연산자는 문자열에 사용할 수 없다. (진리)
        // https://www.javastring.net/java/string/pool 참고 할 것

        String str1 = "안녕하세요?"; // string poll
        String str2 = "안녕하세요?"; // string poll
        String str3 = new String("안녕하세요?"); // heap -> string pool

        System.out.println(str1 == str2); // 예측 : true, 결과 : true
        System.out.println(str2 == str3); // 예측 : true, 결과 : false -> 예측과 틀리다!
        System.out.println(str1 + str2 + str3);
        System.out.println("----------------------------------");

        // String 비교시에는 항상 주의 필요, '=='를 사용하면 예측과 다른 결과나 나올수 있다.
        // new로 생성해서 생긴 일이다. 그러나 개발자가 new 만들지 않아도 인자가 new로 생성된 string이 들어올수 있다.
        // -> 문자열 비교시에는 String.equals 메서드를 사용할것 ★★★★★

        // java에서 문자열 비교시 정석 문법 ★★★★★
        System.out.println(str1.equals(str2)); // str1과 str2가 같은지 비교, true
        System.out.println(str2.equals(str3)); // str1과 str2가 같은지 비교, false? -> true

        // (참고) 문자열이 포함되었는지 확인하는 방법
        String str4 = "안녕";
        System.out.println(str1.contains(str2)); // equals와 같은 결과
        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.contains(str4)); // true, 안녕하세요?에 안녕이 포함되어 있다.

    }
}
