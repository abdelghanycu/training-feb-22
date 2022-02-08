package com.sci.week01.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Square extends Shape {

  private double side;

  @Override
  double area() {
    return side * side;
  }

  @Override
  double perimeter() {
    return side * 4;
  }
}
