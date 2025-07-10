package com.codeit.ex01.enum_exam;

import java.util.*;

public class _Run {
    public static void main(String[] args) {
        // 선언 방법
        EnumBasic enumBasic1 = EnumBasic.VALUE1;
        EnumBasic enumBasic2 = EnumBasic.valueOf("VALUE2");

        // 만일 맞지 않은 값이 value 들어오면 Error 발생!! IllegalArgumentException
//        EnumBasic enumBasic5 = EnumBasic.valueOf("VALUE5");

        // 출력 방법
        System.out.println(enumBasic2); // EnumBasic{intValue=2, stringValue=8}
        System.out.println(enumBasic2.name()); // VALUE2
        System.out.println(enumBasic2.ordinal()); // 순서, 1
        System.out.println(enumBasic2.getIntValue()); // 멤버변수, 2
        System.out.println(enumBasic2.getStringValue()); // 멤버변수 , 문자열 상수값2

        // 순회방법, ※ 주의점 : 배열을 생성해서 전달함으로 성능 저하가 발생할수 있다.
        // 많이 사용하는 enum일 경우 key : EnumBasic 형태의 map을 생성 권장!
        for(EnumBasic enumBasic : EnumBasic.values()) {
            System.out.println(enumBasic);
            System.out.println(enumBasic.name());
        }

        // map 생성 예제
        Map<String, EnumBasic> map = new HashMap<>();
        map.put("VALUE1", EnumBasic.VALUE1); // board, qna, ....
        map.put("VALUE2", EnumBasic.VALUE2);
        map.put("VALUE3", EnumBasic.VALUE3);


        // 비교하는 방법
        EnumBasic enum1 = EnumBasic.valueOf("VALUE1");
        EnumBasic enum2 = EnumBasic.valueOf("VALUE2");

        // == 로도 비교 가능
        System.out.println(enum1 == enum1); // true
        System.out.println(enum1 == enum2); // false

        // compareTo로 비교하는 방법 (정렬류)
        System.out.println(enum1.compareTo(enum2));
        System.out.println(enum2.compareTo(EnumBasic.VALUE3));
        System.out.println("----------------------------------------------------");

        // Week
        System.out.println(Arrays.toString(Week1.values()));
        System.out.println(Arrays.toString(Week2.values()));
        System.out.println(Arrays.toString(Week3.values()));
        System.out.println("---------------------------------------");


        // 컬렉션 Type으로 활용 가능
        List<Week3> list = new ArrayList<>();
        list.add(Week3.FRIDAY);
        list.add(Week3.MONDAY);
        list.add(Week3.SATURDAY);
        list.add(Week3.THURSDAY);
        list.add(Week3.SUNDAY);
        Collections.shuffle(list);
        System.out.println(list);

        // 자연 order로 정렬하기(선언한 순서)
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        // 내가 선언한 order로 정렬하기
        list.sort(Comparator.comparing(Week3::getOrder));
        System.out.println(list);
        System.out.println("---------------------------------------------------");

        // switch enum
        double x = 2.0;
        double y = 3.0;
        for(Operation operation : Operation.values()) {
            System.out.println(x + " " + operation.name() + " " + y + " = " + operation.apply(x, y));
        }
    }
}
