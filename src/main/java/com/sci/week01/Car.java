package com.sci.week01;

import java.util.Date;

public class Car extends Product {

  private int cc;

  public Car() {
    super("", 5, 1, "", new Date());
  }


  public String toString() {
    return "from Car class";
  }
}
