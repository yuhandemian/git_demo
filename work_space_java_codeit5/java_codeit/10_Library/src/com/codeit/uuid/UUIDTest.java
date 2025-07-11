package com.codeit.uuid;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        // UUID : 128비트(16바이트) 고유 식별자(UUID)를 생성하고 표현하는 클래스이다. (RFC 4122 표준에 따름)

        // 랜덤 UUID 생성
        UUID uuid1 = UUID.randomUUID();
        System.out.println("UUID1: " + uuid1);
        System.out.println("Variant: " + uuid1.variant());
        System.out.println("Version: " + uuid1.version());

        // 문자열로부터 UUID 생성
        UUID uuid2 = UUID.fromString("550e8400-e29b-41d4-a716-446655440000");
        System.out.println("UUID2: " + uuid2);

        // 이름 기반 UUID 생성
        UUID uuid3 = UUID.nameUUIDFromBytes("your id".getBytes());
        System.out.println("UUID3: " + uuid3);

        // 문자열로부터 UUID 파싱
        String uuidString = uuid1.toString();
        UUID parsedUUID = UUID.fromString(uuidString);
        System.out.println("Parsed UUID: " + parsedUUID);
    }
}
