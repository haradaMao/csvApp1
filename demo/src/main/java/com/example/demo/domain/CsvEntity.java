package com.example.demo.domain;

import lombok.Data;

@Data
public class CsvEntity {
  private long id;
  private String name;
  private long age;
  private String sex;

  public CsvEntity(long id, String name, long age, String sex) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

}
