package com.codeit.ex01.enum_exam;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE;

    double apply(double x, double y) {
        switch(this) {
            case PLUS: return x + y;
            case MINUS: return x - y;
            case MULTIPLY: return x * y;
            case DIVIDE: return x / y;
            default: throw new AssertionError();
        }
    }

    // 추상 메서드도 선언가능
    // abstract double apply(double x, double y, double z);
}
