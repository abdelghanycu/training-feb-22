package com.sci.week01.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle implements Shape {

  private double length;
  private double width;

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public double perimeter() {
    return (length + width) * 2;
  }
}
