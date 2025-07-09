package com.codeit.ex04.access_modifier2;

import com.codeit.ex04.access_modifier.AccessModifier;

// 다른 패키지 내 Class 영역
public class TestAccessModifier2 {
    public static void main(String[] args) {
        // AccessModifier와 다른 패지키에서 멤버변수 접근 테스트
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicValue = 1; // O, 접근 가능!
//        accessModifier.protectedValue = 2; // X, Error 발생!
//        accessModifier.defaultValue = 3; // X, Error 발생!
//      accessModifier.privateValue = 4; // X, Error 발생! private은 절대 직접 접근할수 없다!
        accessModifier.myMethod();
    }
}
