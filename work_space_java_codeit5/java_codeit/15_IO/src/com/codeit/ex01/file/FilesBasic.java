package com.codeit.ex01.file;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
import org.w3c.dom.ls.LSOutput;

// Files 클래스
// - Path를 통해 경로를 받음으로 Path와 같이 활용
// - File 보다 진보된 기능을 제공하는 클래스로 Java7에서  java.nio와 함께 도입됨
// - file을 관리하기 위한 기능성 클래스로 경로 복사 및 file을 다루는 간단한 방법 제공
// - 내부적으로는 NIO를 사용하기 때문에 성능이 보장되어 있음
// - 대부분 static method로 구현되어 있어 활용 편리함
// - java8 이후에 함수형 프로그래밍 관련 메서드가 추가되어있어 활용이 굉장히 편해짐!
public class FilesBasic {

  public static void main(String[] args) {
    // Paht 활용
    Path path0 = new File("./15_IO/java.txt").toPath();
    File file = path0.toFile();
   //     Path path1 = Paths.of("./15_IO/java.txt");
    //Paths : path를 가져오기 위한 전용 클래스
    Path path1 = Paths.get("./15_IO/java.txt");

    //path 기능들
    System.out.println(path1.getFileName());
    System.out.println(path1.getParent());
    System.out.println(path1.getRoot());
    System.out.println(path1.endsWith(".java"));//확장자 검사
    System.out.println(path1.normalize());//경로가 꼬여있을 떄 정규화 가능 -> /name/..name/name/..
    System.out.println("-------------------------");

    //Files
    //파일 리스트 가져오기
    //try (var stream = Files.lines(Path.of("./15_IO"))) {
    //파일 찾기

//    try (var stream = Files.find(Path.of("15_IO/"), 10,
//        (path, basicFileAttributes) -> {
//      System.out.println(path1);
//      System.out.println(basicFileAttributes);
//      return true;
//
//    } catch (Exception e) {
//      throw new RuntimeException(e);
////    }
//    try {
//      System.out.println();
//      Files.deleteIfExists(Path.of("./15_IO/java.txt"));

//      //복사 @@@ 중요하다 자바에서 파일 카피하는 유일한 방법
//      Path copyPath = Files.copy(Path.of("./15_IO/test.txt", Path.of("./15_IO/test.txt")));
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }

    //파일내용출력:  - 위험하다. 메모리 어떻게 될 줄 알고
    // readALLLInes: ※  금기다.
    try {
      System.out.println();
      List<String> list = Files.readAllLines(Path.of("./15_IO/test.txt"));
      list.forEach(System.out::println);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

    //파일 내용 출력 -> 권장
    //lines : 스트리밍으로 사용하여 메모리를 적게 차지하여 사용 권장

    try(Stream<String> stream = Files.lines(Path.of("./15_IO/test.txt"))) {
      stream.forEach(System.out::println);
      System.out.println();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
