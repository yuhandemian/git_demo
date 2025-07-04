package com.codeit.ex03.string.com.codeit.ex03.string;

// String은 자바에서 가장 많이 활용되고, Java에서 특수취급 (우대)해주는 Type
//여기서 가장 많이 활용됨
public class StringPractice {

  public static void main(String[] args) {
    String stn="abc"; // 문자열 선인 표준
    String str ="abc"; // 문자열 선언 표준
    str = new String( "abc"); // String 절대 new로 생성하지 않는다.
    System.out.println(str);
    // 문자열 합연산 (결함)

    str = "ABC" + "DEF";
    System.out.println(str);
// 문자열 합연산시 고려사항
//- 문자열과 결합되는 모든 타임은 문자열이 된다.
// - type을 결합할때 우선순위 고민이 필요하다.
// -> 연산자간 우선순위 고려는 (괄호)로 해결한다.

    int value = 123 + 45; //168
    System.out.println(value);
    str = 123 + 45 + "ABC" + "DEF";
//    str = 168 + "ABC" + "DEF";
//    str "168ABC" + "DEF";
//    str "168ABCDEF";
    System.out.println(str);
    System.out.println("--------------------------------------");

    //12345ABCDEF를 출력하고 싶다면?
    //해결방법 1. 앞에 ""(빈문자열)로 시작한다. 별별별별
    str = "" + 123 + 45 + "ABC" + "DEF";
    System.out.println(str);

    //해결 방법 2. 괄호 사용
    str = 123 + (45 + "ABC") + "DEF";
    System.out.println(str);

    // 문자열 한글 사용
    str = "한글을 사용할 수 있다. ";
    System.out.println(str);

    // lt : tab, 들여쓰기 문자
    System.out.println("선우길동\t25\t 010-123-4567");
    System.out.println("김길동\t22\t010-1235-4567");
    System.out.println("최길동\t26\t010-123-4567");

    // \n : new line(개행)
    System.out.println("abc\ndef\n");
    System.out.println("abc");

    // \" : "(더블 쿼테이션을 출력하고 싶을 때)
    System.out.println("\"안녕하세요\"");

    // 1\ : 파일 경로 혹은 역슬래시를 출력질때
    System.out.println("\\");
    System.out.println("src/com/codeit/ex03/string/StringPractice.java");
    System.out.println("");
//  src/com/codeit/ex03/string/com/codeit/ex03/string/StringPractice.java

        //  -> ""문자열 안에서 경로를 복사하면 알아서 \\로 변경해준다.

    // \\u : unicode 출력하는 방법
    System.out.println('A');
    System.out.println((int)'A'); // 10진수
    System.out.println("0x"+ Integer.toHexString((int)'A')); // 16진수
    System.out.println("\u0041"); // 유니코드 출력하는 방법
    // 16진수
    // 0x0 ~ 9, 0xA ~ F,  -> 0x10 = 16

    // 텍스트 블록 (Text Block) (Java15+)
    // Text Block은 여러 줄의 문자열을 """(3중 따옴표)로 감싸서,
    // 복잡한 줄바꿈이나 이스케이프 없이 간결하게 표현할 수 있는 Java의 문자열 표현 방식이다.

    String html = """
        
                <html>
                  ‹body>
                    <h1><UNK></h1>
                  </body>
                </html>
        """;


  }


}

