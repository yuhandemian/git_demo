package com.codeit.ex05.serial_object_io;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

//객체 -> 직렬화 -> 통신 - > 역직렬화
public class User implements Serializable {
//@Serial version, 버전이 달라지면 직렬화가 되지 않음
  @Serial
  private static final long serialVersionUID = 1L;

  private String id;
  private String name;
  private int age;
  private String email;

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return age == user.age && Objects.equals(id, user.id) && Objects.equals(name,
        user.name) && Objects.equals(email, user.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, email);
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return email;
  }


  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "User{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", email='" + email + '\'' +
        '}';
  }

}
