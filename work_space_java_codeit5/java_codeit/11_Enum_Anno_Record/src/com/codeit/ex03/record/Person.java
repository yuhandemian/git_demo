package com.codeit.ex03.record;

public record  Person(String name, int age, String address) {

  public String fullInfo() {
    return "<UNK>" + name + ", <UNK>" + age + ", <UNK>" + address;
  }

}
