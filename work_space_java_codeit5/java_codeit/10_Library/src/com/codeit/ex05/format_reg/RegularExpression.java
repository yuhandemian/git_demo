package com.codeit.ex05.format_reg;

import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String input;

        // 1) 숫자만 허용
        input = "1234567890";
        boolean isNumberOnly = Pattern.matches("^[0-9]+$", input);
        System.out.println("input : " + input);
        System.out.println("숫자만: " + isNumberOnly);

        // 2) 영문자만 허용
        input = "abcdefgABCDEFG";
        boolean isAlphaOnly = Pattern.matches("^[a-zA-Z]+$", input);
        System.out.println("input : " + input);
        System.out.println("영문자만: " + isAlphaOnly);

        // 3) 한글만 허용
        input = "홍길동";
        boolean isKoreanOnly = Pattern.matches("^[가-힣]+$", input);
        System.out.println("input : " + input);
        System.out.println("한글만: " + isKoreanOnly);

        // 4) 영문자 + 숫자 허용
        input = "abcdefg1234567890";
        boolean isAlphaNum = Pattern.matches("^[a-zA-Z0-9]+$", input);
        System.out.println("input : " + input);
        System.out.println("영문+숫자: " + isAlphaNum);

        // 5) 한글 + 영문자 + 숫자 허용(특수문자 불허용)
        input = "abcdefg1234567890홍길동";
        boolean isKoreanAlphaNum = Pattern.matches("^[a-zA-Z0-9가-힣]+$", input);
        System.out.println("input : " + input);
        System.out.println("한글+영문+숫자(특수문자X): " + isKoreanAlphaNum);

        // 6) 이메일 형식
        input = "test@email.com";
        boolean isEmail = Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", input);
        System.out.println("input : " + input);
        System.out.println("이메일: " + isEmail);

        // 7) 휴대폰 번호
        input = "010-1234-5678";
        boolean isPhone = Pattern.matches("^01[016789]-?\\d{3,4}-?\\d{4}$", input);
        System.out.println("input : " + input);
        System.out.println("휴대폰번호: " + isPhone);

        // 8) URL 형식
        input = "https://www.test.com";
        boolean isUrl = Pattern.matches("^(https?|ftp)://([\\w.-]+)(:[0-9]+)?(/.*)?$", input);
        System.out.println("input : " + input);
        System.out.println("URL: " + isUrl);

        // 9) 공백만
        input = "     ";
        boolean isWhitespace = Pattern.matches("^\\s+$", input);
        System.out.println("input : " + input);
        System.out.println("공백만: " + isWhitespace);

        // 10) 주민등록번호
        input = "900101-1234567";
        boolean isRRN = Pattern.matches("^\\d{6}-\\d{7}$", input);
        System.out.println("input : " + input);
        System.out.println("주민등록번호: " + isRRN);

        // 11) 특수문자 불허용
        input = "ABC123 가나다";
        boolean isNoSpecialChar = Pattern.matches("^[a-zA-Z0-9가-힣\\s]+$", input);
        System.out.println("input : " + input);
        System.out.println("특수문자불허용: " + isNoSpecialChar);
    }
}
