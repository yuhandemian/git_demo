package com.codeit.ex02.list;

import java.util.Objects;

// 은행정보
public class Member implements Comparable<Member> {
    private String id;
    private String name;
    private int age;
    private double account; // 계좌 잔액

    public Member() {
    }

    public Member(String id, String name, int age, double account) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAccount() {
        return account;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", account=").append(account);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Double.compare(account, member.account) == 0 && Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, account);
    }

    // 객체의 비교점을 정하는 메서드
    @Override
    public int compareTo(Member o) { // 비교할 대상
        // id 기준으로 오름차순 정렬하기
        return id.compareTo(o.getId()); // compareTo : 작으면 -1, 0, 크면 1

        // 내림차순
//        return o.getId().compareTo(id);
    }
}
