package com.codeit.ex01.object;

import java.util.Scanner;

public class SystemObjet {
    public static void main(String[] args) {
        // 1. 표준 출력
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.printf("Hello %s World ", "java");

        // 2. 표준 오류 출력
        System.err.println("error message");

        // 3. 표준 입력
        Scanner scanner = new Scanner(System.in);
//        String value = scanner.nextLine();
//        System.out.println("input : " + value);

        // 4. 현재 시간 (밀리초)
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis : " + currentTimeMillis);

        // 5. 고정밀도 시간 측정
        long start = System.nanoTime();
        for (int i = 0; i < 1000000; i++);
        long end = System.nanoTime();
        System.out.println("Time (ns): " + (end - start));

        // 6. 시스템 속성 조회
        String osName = System.getProperty("os.name");
        System.out.println("os.name: " + osName);

        // 7. 환경 변수 조회
        String path = System.getenv("PATH");
        System.out.println("PATH: " + path);

        // 8. 객체의 원래 해시코드
        Object obj = new Object();
        int hash = System.identityHashCode(obj);
        System.out.println("Identity HashCode: " + hash);

        // 9. 가비지 컬렉션 요청 (힌트일 뿐)
        System.gc();
        System.out.println("Requested GC (not guaranteed)");

        // 10. 프로그램 종료
        // System.exit(0);
        System.out.println("Program would exit here if System.exit(0) were called.");
    }
}
