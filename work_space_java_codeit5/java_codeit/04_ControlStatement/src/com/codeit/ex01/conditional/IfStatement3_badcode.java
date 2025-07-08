package com.codeit.ex01.conditional;

import java.util.Scanner;

public class IfStatement3_badcode {
    public static void main(String[] args) {
        // 로그인 기능
        // ID를 입력 받고 3글자 미만이면 "ID가 짧습니다." -> 실패
        // PW를 입력 받고 8글자 미만이면 실패, PW에 ID가 포함 되어 있으면 실패.

        Scanner sc = new Scanner(System.in);
        System.out.println("id를 입력해주세요.");
        String id = sc.nextLine();

        if(id.length() > 3) { // id 성공!!
            System.out.println("pw를 입력하세요.");
            String pw = sc.nextLine();
            if(pw.length() < 8){
                System.out.println("PW가 짧습니다.");
            } else{
                // 성공
                if(pw.contains(id)){
                    System.out.println("pw에 아이디가 포함되어있습니다.");
                }else{
                    System.out.println("로그인성공");
                }
            }
        }else{ // id가 3글자 미만
            System.out.println("id가 짧습니다.");
        }

    }
}
