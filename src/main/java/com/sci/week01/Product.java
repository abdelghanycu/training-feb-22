package com.sci.week01;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
@AllArgsConstructor
//@Data
@Getter
@Setter
public class Product {

  private String name;
  private int size;
  private int count;
  protected String color;
  private Date createdAt;

  @Override
  public String toString() {
    return "from Product class";
  }
}
