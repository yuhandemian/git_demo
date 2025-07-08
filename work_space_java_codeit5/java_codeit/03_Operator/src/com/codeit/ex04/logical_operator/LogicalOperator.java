package com.codeit.ex04.logical_operator;

// 1=참, 0=거짓
// AND : 모두 참일때만 참
// OR : 하나라도 참이면 참

//  진리표
//  x y  AND OR
//  1 1   1  1
//  1 0   0  1
//  0 1   0  1
//  0 0   0  0

// 논리 연산자 = boolean type으로만 사용됨
public class LogicalOperator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;

        System.out.println(x && y); // && : AND연산, false
        System.out.println(x || y); // || : OR 연산, true
        System.out.println(x && y && z); // 3장 AND 연산 가능!
        System.out.println(x || y || z); // 3장 OR 연산 가능!
        System.out.println(x || y && z); // AND가 OR보다 연산자 우선순위가 높다!
        System.out.println((x || y) && z); // 만일 OR의 우선순위 상승을 위해선 괄호사용★
        // -> 연산자간 우선순위가 명확하지 않을 경우 (괄호) 사용 권장! ★★★★★
        //    괄호를 습관적으로 사용해도 무관하다.


        // 비교 연산자, 숫자만 가능하다.
        int a = 100;
        int b = 50;
        System.out.println(a > b); // a가 b보다 큰가? 크다 -> true, 초과
        System.out.println(a < b); // a가 b보다 작은가? 크다 -> false, 미만
        System.out.println(a >= 100); // a가 b보다 크거나 같은가? 같다 -> true, 이상
        System.out.println(a <= 100); // a가 b보다 작거나 같은가? 같다 -> true, 이하
        System.out.println(!(a > b)); // 부정사용자와 결합 가능
        System.out.println(!(a < b));
        System.out.println("---------------------------------------");

        // 비교 연산자 3개 비교하기
        a = 100;
        b = 50;
        int c = 70;
        // c는 a보다 작고, b보다 c가 큰가?
//        System.out.println(a > c > b); // 안된다. a > c를 비교하면 boolean type이 되고
                                        // b하고 비교하면 피연산자가 type 불일치로 연산되지 않는다.
//        System.out.println((a > c) > b); // 괄호로 안된다!
        // 해결방법
        System.out.println(c < a && c > b); // 관례적인 문법, 외워라!! ★★★★★
//        System.out.println((a > c) && (b > c));

        // a는 50보다 크고, 150보다 작은가? (그리고=AND)
        System.out.println(a > 50 && a < 150);
//        System.out.println(a > 50 || a < 150); // OR수식이 아니다.

        // b는 20 이상 또는 100 미만인가? (OR)
        System.out.println(b >= 20 || b < 100);
    }
}



















