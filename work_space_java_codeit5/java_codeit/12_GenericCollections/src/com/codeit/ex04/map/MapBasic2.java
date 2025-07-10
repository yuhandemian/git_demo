package com.codeit.ex04.map;

import java.util.ArrayList;

public class MapBasic2 {

  public static void main(String[] args) {
    ArrayList<Member> list = new ArrayList<Member>();
    list.add(new Member("testID1", "김길동1", 21, 10000.123));
    list.add(new Member("testID1", "김길동1", 21, 10000.123)); // 완전동일
    list.add(new Member("testID3", "김길동3", 23, 444000.123));
    list.add(new Member("testID2", "홍길동3", 41, 3300.123)); // ID 만 다름
    list.add(new Member("testID2", "김길동2", 22, 10000.123));
  }
}
