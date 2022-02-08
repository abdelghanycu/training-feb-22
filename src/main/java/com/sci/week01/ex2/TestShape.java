package com.sci.week01.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestShape {

  public static void main(String[] args) {

    List<Square> l = new ArrayList<>();
    l.add(new Square(6));
    l.add(new Square(5));
    l.add(new Square(9));

    Collections.sort(l);

    System.out.println(l);

    Square s1 = new Square(5);
    Square s2 = new Square(10);

    System.out.println(s1.compareTo(s2));

    Shape s = new Shape() {
      @Override
      public double area() {
        return 0;
      }

      @Override
      public double perimeter() {
        return 0;
      }
    };

    int n = 10;

    Object[] objects = new Object[n];
    objects[0] = new Square(3.5);
    objects[1] = new Circle(9.5);
    objects[2] = new Rectangle(6, 7.3);

    for(int i = 0; i < n; i++) {
      if(objects[i] != null && objects[i] instanceof Shape) {
        System.out.println(objects[i].toString());
        System.out.println(((Shape) objects[i]).area());
        System.out.println(((Shape) objects[i]).perimeter());
        System.out.println("-----------");
      }
    }
  }
}
