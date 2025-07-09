package com.codeit.ex04.access_modifier2;

import com.codeit.ex04.access_modifier.AccessModifier;

// 다른 패키지에서 상속시킬 클래스, 나중에 상속할때 다시 문법 정리!
public class ExtendsTestAccessModifier extends AccessModifier {

    public void testMehtod(){
        // 다른 패키지이지만, 상속 받은 자식클래스에서 접근 테스트!
        publicValue = 1; // O, 사용가능
        protectedValue = 2; // O, 사용가능
//        defaultValue = 3; // X, 사용불가!
//        privateValue = 4; // X, 사용불가!
    }
}
