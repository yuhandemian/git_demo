package com.codeit.ex05.serial_object_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

  //객체단위로 IO 하는 메서드
  public static boolean saveObject(String path, Object obj) {
    try (FileOutputStream fos = new FileOutputStream(path);
    ObjectOutputStream oos =new ObjectOutputStream(fos);) {
      oos.writeObject(obj);
      return true;
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
  }

  public static Object loadObject(String path) {
    try (FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis)) {
      return ois.readObject();
    } catch ( Exception e) {
      throw new RuntimeException(e);
    }
  }

  //스프린트 과제에서 이렇게 하기
  public static void userObject(){
    User user = new User("test1", "홍길동", 31, "test@email.com");
    boolean result = saveObject("15_IO/objInfo", user);
    System.out.println(result);

    //읽어오기
    User user2 = (User) loadObject("15_IO/objInfo"); //역직렬화
    System.out.println("user1: " + user);
    System.out.println("user2: " + user);
    System.out.println(user.equals(user2));//true!!
  }

  public static void main(String[] args) {
    userObject();
  }
}
