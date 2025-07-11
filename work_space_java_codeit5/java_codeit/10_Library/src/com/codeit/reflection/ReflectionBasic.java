package com.codeit.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionBasic {
    public static void main(String[] args) throws Exception {
        // Reflection이란?
        // - .class 파일을 JVM에서 읽어 Class의 구조를 해석한 정보를 접근하는 방법
        // - class의 구조 정보는 Method Area(static 영역)에 존재하며 해당 메모리 영역에 접근한다.
        // - class의 구조에 관련된 모든 정보(생성자, 멤버변수, 메소드, 정적 영역, 어노테이션 등)을 읽어올수 있다.
        // - 필요시 class의 메소드를 호출할수도 있다.
        // - 사실 일반적인 java 사용자를 위한 기능이 아님으로 응용프로그래밍 영역에서는 사용해서 안된다.(서버,앱 개발)
        // - 프레임워크나 라이브러리 레벨에서 활용하는 기능으로 다른 사용자가 정의한 Class 구조를 해석할때 활용된다.
        // - 자세한건 리플렉션 개념글 참고 : https://steady-coding.tistory.com/609

        MyClass obj = new MyClass();
        Class<?> clazz = obj.getClass();

        // 1. 클래스 이름 출력
        System.out.println("Class name: " + clazz.getName());

        // 2. 생성자 정보 출력
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor: " + constructor);
        }

        // 3. 모든 필드 정보 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName() + ", Type: " + field.getType().getSimpleName());
        }

        // 4. public 필드 값 읽기
        Field publicField = clazz.getField("value");
        System.out.println("Before: value = " + publicField.get(obj));
        publicField.set(obj, "UpdatedValue");
        System.out.println("After: value = " + publicField.get(obj));

        // 5. private 필드 접근 및 변경
        Field privateField = clazz.getDeclaredField("secret");
        privateField.setAccessible(true);
        System.out.println("Before: secret = " + privateField.get(obj));
        privateField.set(obj, "HackedSecret");
        System.out.println("After: secret = " + privateField.get(obj));

        // 6. public 메서드 호출
        Method publicMethod = clazz.getMethod("hello");
        publicMethod.invoke(obj);

        // 7. private 메서드 호출
        Method privateMethod = clazz.getDeclaredMethod("secretHello");
        privateMethod.setAccessible(true);
        privateMethod.invoke(obj);

        // 8. 파라미터 있는 메서드 호출
        Method methodWithArgs = clazz.getMethod("say", String.class);
        methodWithArgs.invoke(obj, "Reflection is powerful!");
    }
}

class MyClass {
    public String value = "MyClass";
    private String secret = "SecretValue";
    public MyClass() {}
    public void hello() {
        System.out.println("Hello, reflection!");
    }
    private void secretHello() {
        System.out.println("this is a secret method.");
    }
    public void say(String message) {
        System.out.println("say(): " + message);
    }
}
