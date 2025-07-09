package com.codeit.ex01.object;

import java.util.Objects;

// 클론 메소드 만드는 방법
// 1. implements Cloneable을 선언한다.
//    -> 자동완성으로 가능!!

// 아래 방법은 인텔리제이에서 활용하는 방법
// 2. clone 메소드를 오버라이드 한다.
// 3. protected -> public, throws CloneNotSupportedException 문장을 지운다.
//    그리고 try-catch문으로 예외처리를 해준다. return null을 마지막줄에 추가
// 4. return type을 Member로 바꾸고 casting으로 Member 객체로 돌려준다.

public class Member implements Cloneable {
    private String id;
    private String name;
    private int age;

    public Member() {
    }

    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    // 객체가 비교가 필요할때 오버라이딩
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    // Map이나 Set에서 활용할때 사용
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

//    @Override
//    public Member clone() {
//        try {
//            Member clone = (Member) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


    // cmd + option + T  -> try- catch 단축키
    @Override
    public Member clone(){

      try {
          Member member = (Member) super.clone();
          return member;
      } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
      } finally {
      }
    }

}
