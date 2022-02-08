package com.sci.week01.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Circle extends Shape {

  private double radius;

  @Override
  double area() {
    return Math.PI * radius * radius;
  }

  @Override
  double perimeter() {
    return 2 * Math.PI * radius;
  }
}
