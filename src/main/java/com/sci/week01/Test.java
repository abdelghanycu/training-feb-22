package com.sci.week01;

import java.io.File;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

  public static void main(String[] args) throws Exception {

    int n = 10;

    String[] name = new String[n];
    int[] size = new int[n];
    Date[] createdAt = new Date[n];
    int[] count = new int[n];
    String[] color = new String[n];

    name[0] = "P1";
    size[0] = 3;
    createdAt[0] = new Date();
    count[0] = 5;
    color[0] = "red";

    name[1] = "P2";
    size[1] = 2;
    createdAt[1] = new Date();
    count[1] = 9;
    color[1] = "blue";

    Product p1 = new Product("p1", 2, 6, "red", new Date());

    p1.setName("fsadfdsa");

    Product[] prod = new Product[5];

    prod[0] = new Product("p1", 2, 6, "red", new Date());
    prod[1] = new Product("p2", 3, 9, "red", new Date());
    prod[2] = new Product("p3", 1, 7, "red", new Date());
    prod[3] = new Product("p4", 1, 4, "red", new Date());
    prod[4] = new Product("p5", 2, 9, "red", new Date());

    System.out.println(prod[0].toString());
    System.out.println(prod[0]);

    System.out.println(
        prod[0].getClass().getName() + "@" + Integer.toHexString(prod[0].hashCode()));

    System.out.println("\n\n*************************************************\n\n");

    Car c1 = new Car();// amr/y.alaa/mos.salah three car
    // hossam car-product-product
    System.out.println("c1= " + c1);//ahmed fahem youssef car

    Product c2 = new Car();

    System.out.println("c2=" + c2);//youssef product

    Object c3 = new Car();

    System.out.println("c3=" + c3);//youssef object

    System.out.println("\n\n***************\n\n");

    Object[] objs = new Object[5];

    objs[0] = new Car();
    objs[1] = new Printer("", 5, 3, "", new Date());
    objs[2] = new Product("", 5, 3, "", new Date());
    objs[3] = new Scanner(System.in);

    for (int i = 0; i < objs.length; i++) {
      if (objs[i] instanceof Car) {
        System.out.println("object " + i + " from class car");
      }
      if (objs[i] instanceof Printer) {
        System.out.println("object " + i + " from class printer");
      }
      if (objs[i] instanceof Product) {
        System.out.println("object " + i + " from class product");
      }
    }

    System.out.println("\n\n*******************\n\n");

    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Enter val: ");
      int val = sc.nextInt();
    } catch (ArithmeticException ex) {
      System.out.println("here exception ArithmeticException");
    }
    catch (InputMismatchException ex) {
      System.out.println("here exception InputMismatchException");
    }
    catch (Exception ex) {
      System.out.println("here exception Exception");
    }
    finally {
      System.out.println("here finally");
    }

    int x = 10;
    int y = 1;

    if(y == 0) {
      throw new Exception("sdafdsafd");
    }

//    if (y != 0) {
      System.out.println(x / y);
//    }
  }

  public int min(int a, int b) {
    return a > b ? a : b;
  }

  public double min(double a, double b) {
    return a > b ? a : b;
  }
}
