package com.codeit.ex06.date;

import java.time.Instant;

public class InstantExample {

  public static void main(String[] args) {
    // Instant란
    // - Instant는 UTC 기준의 타임스탬프
    // - 1970-01-01T00:00:00Z(Unix epoch)부터의 나노초 단위 경과 시간 출력한다
    // - 시계나 타임존 개념이 없는 순수한 시점으로 현재시간 출력에 활용된다.

    //현재 UTC 시간 출력
    Instant now = Instant.now();
    System.out.println(now); //2025-07-10T00:44:16.602224Z  -> 표준 ISO-86 JS도 활용가능, 문서로 소통
    System.out.println("getEpochSecond : " + now.getEpochSecond());
    System.out.println("toEpochSecond : " + now.toEpochMilli());
    System.out.println("getNanos : " + now.getNano());

    //특정 epoch second 생성
    Instant epoch1 = Instant.ofEpochSecond(0);
    Instant epoc2h = Instant.ofEpochSecond(1752108710);
    System.out.println(epoch1);
    System.out.println(epoc2h);

    //10초 뒤 Instant
    Instant later = now.plusSeconds(10);
    System.out.println("later: " + later);

    // 비교
    System.out.println("isBefore :" + now.isBefore(later));
    System.out.println("isAefore :" + now.isAfter(later));
    System.out.println("compareTO :" + now.compareTo(later)); // 정렬
    System.out.println("------");

    // 파싱
    String isoTime = now.toString();
    System.out.println("isoTime: " + isoTime);
    Instant parsed = Instant.parse(isoTime);
    System.out.println("parsed: " + parsed);
    System.out.println(parsed.equals(now));
    System.out.println(parsed.compareTo(now));

  }
}
