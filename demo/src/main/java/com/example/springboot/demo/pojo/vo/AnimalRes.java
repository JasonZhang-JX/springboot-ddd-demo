package com.example.springboot.demo.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalRes {

  private int id;
  private Date time;

  public static AnimalRes ok(int id) {
    AnimalRes res = new AnimalRes();
    res.setId(id);
    res.setTime(new Date());
    return res;
  }
}