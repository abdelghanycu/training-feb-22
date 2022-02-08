package com.sci.week01;

import java.util.Date;

public class Printer extends Product {

  private int paperPerSec;

  public Printer(String name, int size, int count, String color, Date createdAt) {
    super(name, size, count, color, createdAt);
  }
}
