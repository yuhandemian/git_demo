package com.codeit.ex02.string;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringTokenizer;

public class String2 {
  @SuppressWarnings("all")//워닝 없애주는 어노테이션

  public static void main(String[] args) {
    // 0.String 생성자 활용법
    // -> 일반적인 String 생성자로 생성하진 않는다, 근데 가끔 쓸일은 존재한다.
    String s0 = "Hello";
    String s1 = new String("Hello");// 이렇게 쓰면 안된다.
    String s2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}); //생성자 올바른 사용법1
    String s3 = new String(s2.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8); // 생성자 올바른 사용법2
    System.out.println(s0);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println("--------");

    String a = "aaa";
    String b = "aaabbb";
    //1. equls : 문자열 비교해주는 메서드
    // equlasIgnoreCase : 대소문자 무시하고 비교해주는 메서드

    System.out.println("equals");
    System.out.println(a.equals("aaa")); //T
    System.out.println(a.equals("bbb")); //F
    System.out.println(a.equals(b)); // F

    System.out.println("equalsIgnoreCase");
    System.out.println(a.equalsIgnoreCase("AAA"));
    System.out.println(b.equalsIgnoreCase("BBB"));
    System.out.println("---------");

    // 2. contains : 문자열의 포함 여부를 알려주는 메소드, 한글 활용 가능!
    System.out.println("contains"); // 포함 -> true
    System.out.println(a.contains("a")); // 포함 -> true
    System.out.println(a.contains("c")); // 미포함 -> false
    System.out.println(a.contains(b)); // 더 큰범위라 false
    System.out.println("aaabbb".contains("aaa")); // true
    System.out.println(b.contains(a)); // true
    System.out.println("---------------------------------------------------");

    // 3. compareTo : 문자열 대소비교와 같은지 확인하는 메서드, 사전순으로 비교가능
    //ex) 김길동 > 박길동 > 홍길동 > 홍길홍
    //정렬할 때 필요한 메서드 별별별

    System.out.println("compareTo");
    System.out.println("홍길동".compareTo("김길동"));
    System.out.println("김길동".compareTo("홍길동"));
    System.out.println("홍길동".compareTo("홍길동"));
    System.out.println("AAA".compareToIgnoreCase("BBB"));
    System.out.println("bbb".compareToIgnoreCase("AAA"));
    System.out.println("aaa".compareToIgnoreCase("AAA"));
//    10253
//        -10253
//    0
//        -1
//    1
//    0
    //프로그래밍에서 compare계열은 아래의 결과를 따름
    //같으면 0, 크면 양수, 작으면 음수
    //여기서 거리는 문자열 간의 거리
    System.out.println("-------");

    //4.concat : 문자열 결합하는 메서드
    String str1 = "홍길동";
    String str2 = "의 주소지는 서울입니다";
    str1.concat(str2); // 문자열은 불변형으로 자신을 변경하지 못한다.
    // 그래서 자신이 변경되지 않고, 합쳐진 값을 반환한다.

    System.out.println(str1); //홍길동

    //올바른 사용법
    String str3 = str1.concat(str2); //정석
    String str4 = str1 + str2; //논리적 동치 문장
    System.out.println(str3);
    System.out.println(str4);

    System.out.println("------------");

    // ※ String Lib. 사용시 주의점
    // - 일반 객체 설계 메커니즘과 다른점이 존재, 기능을 적용해서 본인은 바뀌지 않고 바뀐 값을 리턴
    // - this(본인)은 불편하는 원칙 (immutable = 불변성) 때문이다.
    // - 바뀐 값을 다시 문자열로 받아야 메소드 기능을 활용할수 있음.

    //5. charAt : 문자열에 index에 해당되는 문자(char) 반환
    String temp = "abcdef";
    for (int i = 0; i < temp.length(); i++) {
      System.out.println(temp.charAt(i) + "");
    }
    System.out.println("\n--------");

    //6. indexOf() : 문자열 내에서 인자로 받은 문자열이 일치하는 index반환
    // fromIndex : 두번쨰 인자로 특정 인덱스 이후로 검색
    // -1 못찾음 0 이상이면 index에 포함

    String str5 = "안녕하세요? 저는 홍길동입니다";
    //             0123456789   10
    System.out.println(str5.indexOf("안녕"));
    System.out.println(str5.indexOf("홍길동"));
    System.out.println(str5.indexOf("하이")); //없는 글자 -1

    str5 = "abcabcabc";
    System.out.println(str5.indexOf("a"));
    System.out.println(str5.indexOf("z"));
    System.out.println(str5.indexOf("bc"));
    System.out.println(str5.indexOf("abc"));

    //첫번째 abc를 찾고 다음 abc를 찾는 방법 -> fromIndex 활용!
    System.out.println(str5.indexOf("abc", 1)); //0이 아닌 다음부터
    System.out.println(str5.indexOf("abc", 2));
    //다음 index를 효율적으로 찾아오는 관레적인 문법(슬라이딩 윈도우)
    int index = str5.indexOf("abc");
    System.out.println(str5.indexOf("abc", index + "abc".length()));






    // 응용편
    // '안녕'이라고 친 문자열 개수를 모두 찾고 인덱스도 모두 출력하세요! = indexOf 활용해서
    String str6 = "안녕하세요? 저는 홍길동입니다. 다들 안녕하셨는지요? "
        + "안녕하지 못하셨으면 죄송하고 안녕히 계세요. 저는 안녕을 찾으러 갑니다.";

    String token = "안녕"; // token = 찾을 문자열 = 작은 문자열 조각
    int startIndex = 0;
    int count = 0; // 찾은 갯수

    // 알고리즘상 반복문 3개가 중첩된 형태로 나와야한다. -> 3차원으로 연산된다.
    while(true) {
      int result = str6.indexOf(token, startIndex);
      if(result < 0) { // 못찾은 경우
        break;
      }
      startIndex = result + token.length();
      count++;
      System.out.println("찾은 index : " + result);
    }
    System.out.println("찾은 갯수 : " + count);
    System.out.println("----------------------------------------------");

    //7. lastIndexOf() : 문자열을 찾는데 뒤로 부터 찾는다.
    System.out.println(str6.indexOf("안녕"));
    System.out.println(str6.lastIndexOf("안녕"));
    System.out.println(str6.lastIndexOf("안녕", 58-2)); //찾은위치 -2

    //9. starWith: 문자열 시작 패턴을 확인
    String str7 = "test.txt";
    System.out.println(str7);
    System.out.println(str7.endsWith("test"));
    System.out.println(str7.endsWith(".txt"));
    System.out.println("----------------");

    // 10. trim 류 : white space를 제거하는 기능, - strip(Since:11)을 추천★★★★★
    // white space란 : 문자열의 노이즈, 사람 눈에 보이지 않는 문자열, 공백, newline, tab등 정보로 필요없는 데이터
    // web 계열에서 사용자의 입력값을 필터링 하는 용도로 가장 많이 활용!!
    //sdjlidksldasd
    final String origin
        = " \r    이름 : #홍길동, 나이 : #23, 주소 : #*서울시 강남구   \u2003\n\t";
    //  \u2003 : 문자열로 인지되지만 쓰레기 값
    System.out.println(origin);
    System.out.println("-----------------------------------------------");
    System.out.println(origin.trim()); //trim : 문자 쓰레기 값을 제외한 white space
    System.out.println(origin.strip()); // strip : 모든 white space를 ,쓰레기 값도 제고 , 성능이 좋다 별별
    System.out.println(origin.stripLeading()); // 앞쪽만 제거하는 방법
    System.out.println(origin.stripTrailing()); // 뒤쪽만 제거하는 방법
    System.out.println(origin.stripIndent()); // \n\t 일부 공백을 살려 indent가 보이도록 제거
    System.out.println("-----------------------------------------------");

    String text = origin.strip(); // 권장
    System.out.println(text);
    // 이름 : #*홍길동, 나이 ; #* , 주소: #*서울시 강남구
    System.out.println("-----------------------------------------------");

    // 11. subString : 문자열 지정한 위치로 자를 떄 활용
    System.out.println("-----------------------------------------------");
    System.out.println(text.substring(10));//앞에서 부터 10글자
    System.out.println(text.substring(4, 10)); // 4~ 10번쨰 글자
    System.out.println(text.substring(text.length() - 10, text.length()));
    System.out.println("-----------------------------------------------");

    //12. replace : 특정 문자열을 모두 교체할 때 활용, 특정 문자열을 모두 삭제할 떄 (공백 활용)
    //             -> 모든 문자열이 교체 삭제된다.
    // replace(oldchar = 변경 할 문자열, newChar = 변경될 문자열)
    // 검색 -> DB, 전처리 -> 백엔드
    System.out.println(text.replace("홍길동", "박길동"));
    System.out.println(text.replace("#*", "")); // #* 제거

    //13. replaceAll : 문자열 검색시 문자열 뿐만 아니라 정규식 패턴을 지원하는 replace 별별별별별별
    // -> id , pw등 중요한 사용자 입력값에서 특수문자를 제거하거나 교체하는 용도
    String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\s]"; // 특수문자를 제거하는 정규식 표현
    System.out.println(origin.replaceAll(match, "").strip());
    System.out.println("-----------------------------------------------");

    // 14. repaceFirst : 처음문자만 교체 할 때
    String str = "AAABBBCC";
    System.out.println(str.replace("A", "Z"));
    System.out.println(str.replaceFirst("A", "Z"));
    System.out.println("-----------------------------------------------");

    //15. split : 문자열을 특정 인자(Delimiter=구분자, 정규식)으로 잘라서 토큰을 반환하는 함수
    // StringTokenizer : 토큰 만들어주는 객체, 성능이 좋다고 한다..

    String[] array2 = text.split(",");
    System.out.println(Arrays.toString(array2));

    String temp2 = "";
    for (String s : array2) {
      temp2 += s + "/";
    }
    System.out.println(temp2);
    System.out.println("-----------------");

    // 17. StringTokenizer : Split 객체버전
    System.out.println(text);
    StringTokenizer tokenizer = new StringTokenizer(text, ",");
    // while + nextMore
    while (tokenizer.hasMoreElements()) {
      System.out.println(tokenizer.nextElement()); // 다음 요소 출력
    }
    System.out.println("-----------------");

    // 18. 대/소문자 변경하기 - toXXXXCase
    String temp5 = "ABC abc AAA bbb";
    System.out.println(temp5.toUpperCase()); // 올려준다=대문자 변경
    System.out.println(temp5.toLowerCase()); // 내려준다=소문자 변경
    System.out.println("-------------------------------------");

    // 19. valueOf : 다른 자료형을 문자열로 변경하는 방법
    int age = 23;
    String ageStr1 = "" + age; // 이 방법 추천
    String ageStr2 = String.valueOf(age);
    System.out.println(ageStr1);
    System.out.println(ageStr2);
    System.out.println("-------------------------------------");

    // 20. repeat : 반복시키기
    String repeatText = "ABC".repeat(10);
    System.out.println(repeatText);
    System.out.println("-".repeat(50));

    // 21. format : %d, %f, %s등 format 출력 지원하는 함수
    //    -> 소수점 자르는 용도로 많이 활용
    String str11 = String.format("%d %.2f %s", 10, 3.14, "안녕");
    System.out.println(str11);

  }

}
