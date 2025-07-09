package com.codeit.ex05.format_reg;

public class StringFormat {
    public static void main(String[] args) {
        // StringFormat : Java에서 정해진 형식에 따라 문자열을 출력하거나 생성할 수 있도록 하는 기능
        // c언어부터 사용해온 format specifier 그대로 사용

        String result = String.format("이름: %s\n 나이: %d\n 키: %.1fcm\n결혼여부 : %b", "홍길동", 31, 174.23, false);
        System.out.println(result);

        // .2f : 소수점 2번째 까지만
        System.out.printf("%s, %d, %f\n", "String", 10, 13.109820128);
        System.out.printf("%s, %d, %.2f\n", "String", 10, 13.109820128);
    }
}
