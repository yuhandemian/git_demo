import java.util.Arrays;

public class ObjectArray {

  public static void main(String[] args) {
    //선언 및 초기화
    Member[] members;
    Member[] members1 = null;
    Member[] members2 = new Member[10]; // 표준적으로 초기화하는 문장
    int[] intArray = {1, 2, 3};
    Member[] members3 =/* new Member[] */ {
        new Member("test1", "홍길동", 31),
        new Member("test12", "홍길동", 31),
        new Member("test13", "홍길동", 31),
    };

    //사용법
    //members[0].setName("홍길동");//죽는 이류 지역변수 초기화 안해서 , 모둔 지역 변수는 초기화 이후 사용
    //members1[0].setName("홍길동");// 죽는 이유ㅡ, java.lang.NullPointerException
    //members1[0].setName("<UNK>");//null 초기화 이후 생성 안함.
    // members2[0].setName("<UNK>");// 배열은 초기화 했는데 Member 생성을 안해서
    System.out.println(Arrays.toString(members2));
    members2[0] = new Member();// 0번 방에 Member 생성
    //System.out.println(members2[0].getName().equals("홍길동"));// 죽는 이류 name 문자열을 초기화 안해서

//정상적인 사용법
    System.out.println(Arrays.toString(members3));
    System.out.println(members3[0].getName().length());
    System.out.println(members3[0].getName().equals("홓길동"));
    System.out.println("---");

    //객체 배열을 올바르게 초기홯 ㅏ고 안전하게 사용하는 방법
    // 1. 배열을 선언 알맞은 크기로 초기화
    //2. 실제 사용할 객체에 new 생성 배열 채용
    //3. 배열 빈공간이 생길수 있음으로 항상 null 체크 이후 해당영여겡 접근한다.

    Member[] members4 = new Member[10];
    members4[0] = new Member("test1", "홍길동", 25);
    members4[0] = new Member("test2", "감길동", 25);
    members4[0] = new Member("test3", "임길동", 25);

    //null 체크 방법
    if (members4[0] != null) {
      System.out.println("members[0]는 null 이 아닙니다");
      System.out.println(members4[0].getName());
    }

    //null 체크 방법 2번째, null 가드
    if (members4[0] != null && members4[0].getName() != null) {
      System.out.println(members4[5].getName().length());
    }

    //객체 배열을 초기화 하는 방법
    //1. 인자 있는 생성자를 통해 초기화 하는 방법

    for (int i = 0; i < members4.length; i++) {
      members4[i] = new Member("test" + i, "홍길동" + i, 25 + i);
    }

//2. defailt 생성자를 통해 생성하고 인자를 넣는 방법
    for (int i = 0; i < members4.length; i++) {
      members4[i] = new Member();
      members4[i].setId("test" + i);
      members4[i].setName("<UNK>" + i);
      members4[i].setAge(i);
    }

    //객체 배열 순회하는 방법
    //1. 일반 반복문을 통해 순회하는 방법
    for (int i = 0; i < members4.length; i++) {
      System.out.println(members4[i].toString());
      int age = members4[i].getAge();
      members4[i].setAge(age);
      System.out.println(members4[i].toString());

    }

    //2.for each문으로 순회하는 방법

    for(Member member : members4) {
      System.out.println(member.toString());
      members4[member.getAge()].setAge(member.getAge() + 1);
    }

    //3. print 필요할때 깔끔하게 한줄로 치는 방법
    System.out.println(Arrays.toString(members4).replace("[", "").replace("]", ));

    //객체 배열에 빈공간을 skip하는 방법

    members4[4] = null;
    for(Member member : members4) {
      if(member == null) {
        continue;
      }
      System.out.println(member);
    }



  }
}
