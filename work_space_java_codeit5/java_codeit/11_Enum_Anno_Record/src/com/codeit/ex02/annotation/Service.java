package com.codeit.ex02.annotation;

// 어노테이션을 사용할 Class

//@AnnotationBasic // 사용자 입력값은 없고 어노테이션만 붙은 상태, default값이 초기화 됨
//@AnnotationBasic("test") // value에 test값이 들어옴
//@AnnotationBasic(values = "test") // values(배열)에 하나의 인자만 넣을때
//@AnnotationBasic(values = {"test1","test2"}) // values(배열) 여러개를 넣을때
@AnnotationBasic(number = 5, value = "test", values = {"1","2","3"})
public class Service {

    @AnnotationBasic
    @PrintAnnotation
    public void method1(){
        System.out.println("method1 실행");
    }

    public void method2(){
        System.out.println("method2 실행");
    }

    @PrintAnnotation(value="#", number = 20)
    public void method3(){
        System.out.println("method3 실행");
    }
}
