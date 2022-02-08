package com.sci.week01.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle extends Shape {

  private double length;
  private double width;

  @Override
  double area() {
    return length * width;
  }

  @Override
  double perimeter() {
    return (length + width) * 2;
  }
}
