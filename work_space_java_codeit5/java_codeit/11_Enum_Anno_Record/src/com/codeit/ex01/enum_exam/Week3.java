package com.codeit.ex01.enum_exam;

// 이름과 요일, 출력시 순번
public enum Week3 {
    MONDAY("월", 1), TUESDAY("화", 2), WEDNESDAY("수", 3),
    THURSDAY("목", 4), FRIDAY("금", 5), SATURDAY("토", 6),
    SUNDAY("일", 0);

    private final String day;
    private final int order;

    Week3(String day, int order) {
        this.day = day;
        this.order = order;
    }

    public String getDay() {
        return day;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Week3{");
        sb.append("day='").append(day).append('\'');
        sb.append(", order=").append(order);
        sb.append('}');
        return sb.toString();
    }
}
