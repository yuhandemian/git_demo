package com.codeit.ex04.var;

import java.util.ArrayList;

//안중요 하다
public class VarPractice {

    public static void main(String[] args) {
        var name = "홍길동"; // String으로 추론
        var age = 25; // int로 추론
        var list = new ArrayList<String>(); // ArrayList<String>으로 추론

        System.out.println(name);
        System.out.println(age + 5);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);


        // 추론이 되지 않아 에러가 발생하는 문장
//        var x; // ❌ 초기화 안 함
//        var result = null; // ❌ 타입 추론 불가능
    }
}
