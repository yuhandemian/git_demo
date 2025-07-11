package com.codeit.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {
    // Wrapper Class의 역할
    //  : 기본형을 Wrapping해서 참조형으로 변환 시켜주는 기능
    //  - Integer, Double ..
    // 1. 기본형의 도움을 줄수 있는 API를 제공함.
    // 2. ArrayList와 같은 객체기반의 자료구조에 기본형을 담을때 사용됨.

    public static void main(String[] args) {
        int age = 26;
        Integer ageObj = new Integer(age); // Java 1.4버전 이하 문법, 'Integer(int)' is deprecated since version 9 and marked for remova
        Integer ageObj2 = (Integer)age; // Boxing, Java 1.5버전 이상에서 적용 가능한 문법
        Integer ageObj3 = age; // AutoBoxing 1.5버전 이후부터는 자동으로 기본형<->참조형 변환 가능!!
        System.out.println(age);
        System.out.println(ageObj);
        System.out.println(ageObj2);
        System.out.println(ageObj3.toString());

        // 기본형은 컬렉션 활용시 type으로 활용될수 없다!
//        List<int> list = new ArrayList<int>(); // Type argument cannot be of primitive type
        List<Integer> list = new ArrayList<>(); // Wrapper class로 int를 대체해서 사용 가능
        list.add((Integer) 1); // 1.5 버전 이전 문법=Boxing
        list.add((Integer) 2); // 1.5 버전 이전 문법=Boxing
        list.add((Integer) 3); // 1.5 버전 이전 문법=Boxing
        list.add(4); // 1.6 이상 문법
        list.add(5); // 1.6 이상 문법
        list.add(6); // 1.6 이상 문법
        System.out.println(list);


        // API 적인 활용 예시
        // 1. 문자 해석 기능 : parseXXXX
        System.out.println(Integer.parseInt("123") + 5);
        System.out.println(Double.parseDouble("3.14") + 1.2);

        // 2. 숫자간 대소비교 ★★★★★외워라!!
        // -> 정렬 기능 구현시 필수적으로 활용하는 문법
        // 문자열 비교방법 : "abc".compareTo("bcd");
        System.out.println(Integer.compare(30, 10)); // 1 : 앞이 크면 양수
        System.out.println(Integer.compare(10, 30)); // -1 : 뒤가 크면 음수
        System.out.println(Integer.compare(10, 10)); // 0 : 같으면 0

        // 3. min max 구할때
        System.out.println(Integer.min(5, 2));  // 2
        System.out.println(Integer.max(10, 2)); // 10
        System.out.println(Math.max(10, 2)); // 10

        // 4. 기본형의 최대값, 최소값
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
