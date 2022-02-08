package com.sci.week01.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Square implements Shape, Comparable<Square> {

  private double side;

  @Override
  public double area() {
    return side * side;
  }

  @Override
  public double perimeter() {
    return side * 4;
  }

  @Override
  public int compareTo(Square o) {
    if (side == o.side) {
      return 0;
    } else if (side > o.side) {
      return 1;
    } else {
      return -1;
    }
  }
}
