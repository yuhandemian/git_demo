package com.codeit.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        // 리플렉션 객체로 불러오는 방법
        // 1. Class이름.class
        System.out.println(ReflectionTest.class.getName());

        // 2. Class.forName
        // ctrl + alt + t -> try-catch문 자동생성
        try {
            System.out.println(Class.forName("java.lang.String").getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // 3. getClass()로 활용
        ReflectionTest obj = new ReflectionTest();
        System.out.println(obj.getClass());


        // 리플렉션 활용 방법
        String str = "Hello Java World";
        System.out.println(str.getClass().getName()); // 패키지 포함한 이름
        System.out.println(str.getClass().getName()); // 패키지 포함한 이름
        System.out.println(str.getClass().getSimpleName()); // 클래스 이름
        System.out.println(str.getClass().getSuperclass().getName()); // 부모
        System.out.println(str.getClass().toGenericString()); // toGenericString
        System.out.println("---------------------------------------------------");

        // 생성자 정보
        System.out.println("생성자 정보");
        for (Constructor<?> constructor : str.getClass().getDeclaredConstructors()) {
            System.out.println(constructor.toGenericString());
            try {
                if(constructor.getParameterCount() == 1
                        && constructor.getParameterTypes()[0].getName().equals("java.lang.String")){
                    // 생성자로 객체 생성하는 방법
                    String str2 = (String)constructor.newInstance("Hello Java World!");
                    System.out.println(str2 + "@@@@@@@");
                }
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("----------------------------------------------------");

        // 필드 정보
        System.out.println("필드 정보");
        for (Field field : str.getClass().getDeclaredFields()) {
            System.out.println(field.toGenericString());
//            field.set(str, "Test"); 필드가 set 하기
        }
        System.out.println("----------------------------------------------------");

        // 메서드 정보
        System.out.println("메서드 정보");
        for (Method method : str.getClass().getDeclaredMethods()) {
            System.out.println(method.toGenericString());
            if (method.getName().equals("length")) {
                // invoke : 대상 메소드를 실제 호출하는 기능
                System.out.println(method.invoke(str, null));
                System.out.println(((String) str).length());
            }
        }
        System.out.println("----------------------------------------------------");

    }
}







