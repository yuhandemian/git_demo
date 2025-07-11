package com.codeit.ex02.user_exception;// 사용자 예외를 만드는 코드
// - 언어의 사용자가 지정한 에러로 원인이나 예외의 이름을 지정하여 외부로 알리는 방법

// Exception 상속 예제
// - 체크드 예외 (Checked Exception)로 만드는 방법
// - Exception으로 상속하는 경우 try-catch 문이 강제됨

public class LoginException extends Exception {
    private final LoginErrorCode errorCode;

    public LoginException(LoginErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public LoginErrorCode getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode.getCause();
    }

    @Override
    public void printStackTrace() {
        System.err.println("로그인에 실패하였습니다.");
        System.err.println("원인 : " + errorCode.getCause());
        super.printStackTrace();
    }
}
