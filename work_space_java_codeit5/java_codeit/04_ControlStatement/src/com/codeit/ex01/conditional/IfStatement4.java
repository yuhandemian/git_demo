package com.codeit.ex01.conditional;

import java.util.Scanner;

public class IfStatement4 {
    // 강사가 추천하는 if문 구성 스타일
    // 1. 예외를 먼저 if + return문으로 필터링한다. (나중에는 예외로 처리하여 날린다.)
    // 2. 정상 케이스를 가장 아래쪽으로 배치하고, 들여쓰기 0 level로 구성 하도록 한다.
    // -> 해당 스타일의 장점 : 코드의 복잡도가 줄어든다. (간결해진다.)

    public static void main(String[] args) {
        // 로그인 기능
        // ID를 입력 받고 3글자 미만이면 "ID가 짧습니다." -> 실패
        // PW를 입력 받고 8글자 미만이면 실패, PW에 ID가 포함 되어 있으면 실패.

        Scanner sc = new Scanner(System.in);
        System.out.println("ID를 입력하세요.");
        String id = sc.nextLine();

        // 예외 필터1 -> ID를 입력 받고 3글자 미만이면 "ID가 짧습니다." -> (메서드 종료)
        if(id.length() < 3) {
            System.out.println("ID 짧습니다.");
            return;
        }

        // 예외 필터2 - PW를 입력 받고 8글자 미만이면 실패 -> 메서드 종료, PW에 ID가 포함 되어 있으면 실패.
        System.out.println("PW를 입력하세요.");
        String pw = sc.nextLine();
        if(pw.length() < 8 || pw.contains(id)){
            System.out.println("PW 짧거나 pw에 id 포함되어 있습니다.");
            return;
        }

        // 정상 케이스
        System.out.println("로그인 성공");
    }
}
