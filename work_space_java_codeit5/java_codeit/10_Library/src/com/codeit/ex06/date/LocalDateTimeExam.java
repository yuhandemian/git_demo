package com.codeit.ex06.date;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

//날짜  관련 Library2
public class LocalDateTimeExam {
  public static void main(String[] args) {
    // Java8 이후 추가된 java.time
    // - 기본적으로  TimeZone을 적용, (local = 현지 시간)
    // - 기존 Date, Calendar 체계보다 성능적으로나 활용적으로 더 좋은 Joda-Time을 내장 시켰다.
    // - 레거시 환경에서는 library 버전 이슈나 jsp에서 적용이 되지 않아 사용할수 없다.
    // - Mybatis나 JPA 환경에서는 거의 자동으로 호환됨으로 REST로 만들때는 활용하는게 좋다.

    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();
    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

    System.out.println(localDate);
    System.out.println(localTime);
    System.out.println(localDateTime); //2025-07-10T10:22:51.365280  < ISO 포맷팅, Z들어가면 UTC

    // 타임존 세팅하기
    LocalDate timeZone = LocalDate.now(ZoneId.of("Asia/Seoul"));
    System.out.println(timeZone);

    System.out.println("---");

    //연원일시분 까지 다루는 방법
    LocalDateTime dateTime = LocalDateTime.of(2000, 3, 10, 10, 19, 10);
    System.out.println("datetime : " + dateTime);
    System.out.println("datetime : " + dateTime.getYear());
    System.out.println("datetime : " + dateTime.getMonth());
    System.out.println("datetime : " + dateTime.getDayOfMonth());

    //포맷팅 예제
    System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME)); //2000-03-10T10:19:10
    System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
    System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));
    System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE)); //주단위
    System.out.println("---------------");

    // 날짜 연산
    LocalDate dateTime1 = LocalDate.of(2025, 7, 9);
    LocalDate dateTime2 = LocalDate.now();

    System.out.println(dateTime1.isAfter(dateTime2));
    System.out.println(dateTime2.isAfter(dateTime1));
    System.out.println(dateTime1.plusDays(5));
    System.out.println(dateTime1.minusDays(5));
    System.out.println(dateTime1.plusWeeks(1));
    System.out.println(dateTime1.minusWeeks(1));
    System.out.println(dateTime1.plusMonths(5));
    System.out.println(dateTime1.minusMonths(5));
    System.out.println("--------------------------------------------------------");

    //Period : 날짜(년, 월, 일) 간의 차이를 표현하는 클래스
    //Duration : 시간(시, 분, 초, 나노초) 간의 차이를 표현하는 클래스
    LocalDate startDate = LocalDate.of(2025, 7, 9);
    LocalDate endDate = LocalDate.of(2026, 1, 29);
    Period period = Period.between(startDate, endDate);
    System.out.println("Period :" + period);
    System.out.println("Month :" + period.getMonths() + ", Days :" + period.getDays());
    System.out.println("------------");

    //Duration
    LocalTime startTime = LocalTime.of(15, 0);
    LocalTime endTime = LocalTime.of(18, 23);
    Duration duration = Duration.between(startTime, endTime);
    System.out.println("Duration :" + duration);
    System.out.println("Hours :" + duration.toHours() + ", Minutes :" + duration.toMinutes());
    System.out.println("------");

    // ZonedDateTime 적용해보기
    // - 날짜(LocalDate), 시간(LocalTime), 그리고 시간대(Time Zone) 정보를 모두 함께 다루는 클래스
    System.out.println("한국 시간");
    ZonedDateTime zonedDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul")).atZone(ZoneId.of("Asia/Seoul"));
    System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
    System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
    System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    System.out.println(zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));

    System.out.println("영국 시간");
    ZonedDateTime zonedDateTime2 = LocalDateTime.now(ZoneId.of("Europe/London")).atZone(ZoneId.of("Europe/London"));
    System.out.println(zonedDateTime2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(
        Locale.UK)));
    System.out.println(zonedDateTime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.UK)));
    System.out.println(zonedDateTime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.UK)));
    System.out.println(zonedDateTime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK)));
    System.out.println(zonedDateTime2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.UK)));
    System.out.println("--------------------------------------------------------");

    // DateTimeFormatter - format 바꾸는 방법 ★★★★★
    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime ldt = LocalDateTime.now();
    String formatted = dtf.format(ldt);
    System.out.println(formatted);
    
    //파싱하는 방법
    LocalDateTime ldt2 = LocalDateTime.parse(formatted, dtf);
    System.out.println(ldt2);
    
    System.out.println("-------");
    
    //Date(레거시) Type과 호환하기
    //Date -> LocalDateTime 변환

    Date date = new DateTest();
    LocalDateTime ldt3 = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    System.out.println(ldt3);
    Instant instant = date.toInstant();
    System.out.println(instant);

    //LocalDateTime -> Date

    LocalDateTime ldt4 = LocalDateTime.now();
    Date date2 = Date.from(ldt4.atZone(ZoneId.systemDefault()).toInstant());
    Date date3 = Date.from(Instant.now());
    System.out.println(date2);
    System.out.println(date3);
  }

}
