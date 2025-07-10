package com.codeit.ex01.enum_exam;

public enum Week2 {
    MONDAY("월"), TUESDAY("화"), WEDNESDAY("수"),
    THURSDAY("목"), FRIDAY("금"), SATURDAY("토"), SUNDAY("일");

    private final String day;

    Week2(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Week2{");
        sb.append("day='").append(day).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
