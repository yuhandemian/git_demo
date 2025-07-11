package com.codeit.ex02.user_exception;

// LoginError의 유형과 원인을 알려줄수 있는 enum문
public enum LoginErrorCode {
    WRONG_ID(501, "아이디가 잘못 되었습니다."),
    WRONG_PW(502, "패스워드가 잘못 되었습니다."),
    NOT_INPUT_ID(601, "아이디가 입력되지 않았습니다."),
    NOT_INPUT_PW(602, "패스워드가 입력되지 않았습니다."),
    DB_ERROR(701, "DB에서 조회할수 없습니다.");

    private final int code;
    private final String cause;

    LoginErrorCode(int code, String cause) {
        this.code = code;
        this.cause = cause;
    }

    public int getCode() {
        return code;
    }

    public String getCause() {
        return cause;
    }
}
