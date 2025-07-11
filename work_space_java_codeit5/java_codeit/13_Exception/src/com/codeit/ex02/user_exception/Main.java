package com.codeit.ex02.user_exception;

public class Main {

    public static void main(String[] args) {
        // 로그인 기능 예시
        // 사용자에게 입력 받아온 id, pw값
        String inputId = "test";
        String inputPw = "1234";
        
        boolean isLogin = false;

        // Exception으로 만들었기 때문에 반드시 예외처리 필요
//        isLogin = login(inputId, inputPw);

        try {
            isLogin = login(inputId, inputPw);
        } catch (LoginException e) {
            // 로그인이 실패한 경우 -> 사용자한데 알린다.
            System.err.println(e.getMessage());
            LoginErrorCode code = e.getErrorCode();
            // log 메세지 작성
            System.err.println("code : " + code.getCode() +", " + code.getCause());
            e.printStackTrace();
            return;
        }
        if(isLogin){
            System.out.println("로그인이 완료 되었습니다.");
        }

    }

    private static boolean login(String inputId, String inputPw) throws LoginException {
        // 실제 DB에서 조회된 id, pw
        String memberId = "test";
        String memberPw = "1234";

        if(inputId == null || inputId.isEmpty()){
            throw new LoginException(LoginErrorCode.NOT_INPUT_ID);
        }
        if(inputPw == null || inputPw.isEmpty()) {
            throw new LoginException(LoginErrorCode.NOT_INPUT_PW);
        }
        if(!inputId.equals(memberId)) {
            throw new LoginException(LoginErrorCode.WRONG_ID);
        }
        if(!inputPw.equals(memberPw)) {
            throw new LoginException(LoginErrorCode.WRONG_PW);
        }
        // DB가 에러난 경우
//        throw new LoginException(LoginErrorCode.DB_ERROR);
        return true;
    }

}
