package com.codeit.ex02.object;

public class Member {


    //필드(멤버)의 블록 범위
    //객체의 시작은 보통 필드 선언부로 시작하는게 일반적
    //멤버 변수란? 객체 가질수 있는 데이터(속성)

    public String name;
    public int age;
    public String phone = "ㅁㄴㅇ";
    public String address = "서울시 강남구"; // 전화번호, 초기화 가능한데, 사용하지 말 것 DB에서 떙겨옴



  //생성자란?
  // 객체가 생성 될 때 호출되는 특별한 메서드
  // 용도 객체 멤버변수 초기화 다른 초기화 로직이 필요할때 활용
  //특징: return을 가질 수 없다.  생성자를 선언하지 않은 JVM이 알아서 만들어 준다.
  // 형식: 객체의 이름 () = default꼴 만일 없으면 JVM 생성되는 꼴

  public Member() {
    name = "<UNK>";// 의도적인 초기화
  }

  //메서드 자리 : 객체에서 기능을 담당하는 코드영ㅇ역
  //void method(): 매개변수가 없고 , 리턴 값도 없는 일반 메서드
  //void : 리턴값 없을 때
  public void sayHello() {
    System.out.println("Hello, " + name + "입니다");
  }

  // 매개변수 (인자)가 있는 메서드 설계 예시
  // 매개변수란? 메서드를 선언시 외부로 부터 전달 받을 값을 설계하는 변수
  // void method(매개변수) : 리턴값이 없고, 인자 1개 이상

  //setter의 표준 형태 ( 쓰기 전용 )
  public void setName(String name) {
    //String name은 지역 변수  setName 메서드의 블록 범위에 해당됨
    name = "홍길동";
    age =10;
    this.name = name; // this -> 필드 블록을( 위에 있는거) 를 가르치는 키워드( 필드 블록으로 검색하는 키워드)
  //멤버 변수인 name에 매개변수 name 값을 대입하는 문장

  }

  // void method
  public void setAge(String name, String address) {
    this.name = name;
    this.address = address;
  }

  //String method()
  public String getName(){
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAgeStr(){
    return "" + age;
  }

  //

  public String setAndGetName(String name){
    this.name = name;
    return this.name;
  }


  //chain 설계
  //Member m = new Member()
  //m.setNameAdnChain("홍길동").getAge()
  // 빌더 패턴에서 활용됨
  public Member setNameAndChain(String name){
    this.name = name;
    return this;
  }

}
