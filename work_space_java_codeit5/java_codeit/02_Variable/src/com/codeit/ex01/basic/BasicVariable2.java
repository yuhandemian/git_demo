package com.codeit.ex01.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BasicVariable2 {

  // 기본형 Type (8가지)
  // 1. 정수형 : byte(1), short(2), int(4)★, long(8)★
  // 2. 실수 : float(4), double(8)★
  // 3. 문자 : char(2)
  // 4. 논리형 : boolean(1)★
  public static void main(String[] args) {
    // 1. 정수형 : byte(1), short(2), int(4)★, long(8)★
    byte byteValue = 127;
    short shortValue = 32767;
    int intValue = 2147483647;
    int intValue2 = 2_100_000_000; // 정수를 _로 분류 가능
    long longValue = 2100000000l; // long의 리터럴은 l L 된다.
    long longValue2 = 2100000000L; // L권장

    //lon 보다 더 큰 수를 범위를 연산
    BigInteger bigInteger = new BigInteger("9379817589175902");
    BigDecimal bigDecimal = new BigDecimal("82092851590.10983190283");

    System.out.println(byteValue);
    System.out.println(shortValue);
    System.out.println(intValue);
    System.out.println(intValue2);
    System.out.println(longValue);
    System.out.println(longValue2);
    System.out.println(bigInteger);
    System.out.println(bigDecimal);

    // 2. 실수 : float(4), double(8)*
   //- 실수는 정확도 이슈가 있음으로 가능하면 double를 사용하는 것을 권장
    float floatValue = 3.141592653589793238F; // float 리터럴 끝은 f, F 둘다 가능
    double doubleValue = 3.141592653589793238;

    System.out.println(floatValue);
    System.out.println(doubleValue);

    // 부동소수점의 표현은 계산의 오류가 내포한다는 것을 인지해야함
    // 컴퓨터에서 부동소수점 연산은 항상 오차를 발생하나 double로 사용할 경우 오차가 극히 적음.
    // 부동소수점 표현 방법 지수부(10^-1), 가수부(314159265...)로 구성되어 있음
    // 실제 변수 크기에 따라 표현이 제한적이다!

    //BigDecimal -> 가급적 쓰지 말것 !!  연산이 어마무시하게 느리다.
    BigDecimal bigDecimal2 = new BigDecimal("3.141592653589793238");
    System.out.println(bigDecimal2);

    //부동소수점 오차 테스트
    float testFloat = 0.1f + 0.2f;
    double testDouble = 0.1 + 0.2;

    System.out.println(testFloat); // 예측 : 0.3 , 결과 : 0.3
    System.out.println(testDouble); // 예측 : 0.3, 결과 : 0.30000000000000004 (?)
    // 결론 : 부동소수점은 항상 오차 가능성 존재하고, 자리수 제한도 무척 중요!!
    // 백엔드는 그냥 주고 UI에서 00000004 같은거 짤라야함

    //자리수 자르는 예시
// 1. 문자열 포멧 예시
    String str = String. format ("%.2f", testDouble );
    System.out.println(str);
// 2. printf
    System.out.printf("%.2f\n", testDouble );

    // 3. 문자 char(2) - unsigned char, 유니코드
// 'a' = char 표기
// "a" = String 표기

    char charValue = 'A'; //문자 표기가 정석
    char charValue1 = 65; //아스키상에서 'A'가 되는 숫자 참고 https://domybestinlife.tistory.com/78
    char charValue2 = '가';// 44032
    char charValue3 =  44032;// 가
    //char charValue4 =  "가나다" // 오류
    System.out.println(charValue);
    System.out.println(charValue1);
    System.out.println(charValue2);
    System.out.println(charValue3);

    //char 응용
    System.out.println((char)charValue + charValue1);// 130 -> char
    System.out.println((char)charValue + 1);
    System.out.println("" +charValue + charValue1); //AA
    System.out.println((int) '가'); // 가의 유니코드를 알고 싶을 때
    System.out.println((char) ('가' + 1)); //나?  실제 : 각
    System.out.println((char) ('가' + 2)); //나?  실제 : 갂

    // 알파벳순으로 올력하는 방법
    for(int i = 0; i < 'Z' - 'A' + 1; i++) {
      System.out.print((char)('A' + i) + " ");
    }

    //4.논리형 boolean(1)
    //- 참과 거짓값으로 판별하는 값, true, false 가능
    boolean boolValue = true;
    boolean boolValue2 = false;
    System.out.println(boolValue);
    System.out.println(boolValue2);

    //상수 : 프로그래밍에서 변하지 않는 값
    //상수 표기법 : 모두 대문자 띄어쓰기는 _ (파스칼 표기)
    final int USER_MAX_VALUE = 50; // 사용자 최대 수 50
    final int USER_MIN_VALUE = 10; // 사용자 최소 수 10
    // USER_MAX_VALUE =50; 한번 초기화 된 상수는 변경할 수 없다.(불변_
    System.out.println(USER_MAX_VALUE);
    System.out.println(USER_MIN_VALUE);
    // 상수의 올바른 표기법
//    public static final int USER_MAX_VALUE = 50; // 상수의 올바른 표기법은 이것이다
//    final static public int USER_MAX_VALUE = 50;

//    public class MyClass {
//      public static final int USER_MAX_VALUE = 50; // 올바른 상수 선언
//      public static final int USER_MIN_VALUE = 10;
//
//      public static void main(String[] args) {
//        System.out.println(USER_MAX_VALUE);
//        System.out.println(USER_MIN_VALUE);
//      }
//    }


  }
}