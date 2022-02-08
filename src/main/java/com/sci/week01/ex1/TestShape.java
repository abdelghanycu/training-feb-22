package com.sci.week01.ex1;

public class TestShape {

  public static void main(String[] args) {

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
