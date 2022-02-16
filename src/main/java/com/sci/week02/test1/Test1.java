package com.sci.week02.test1;

public class Test1 {

  public static void main(String[] args) {
    MyArrayList1<Integer> list = new MyArrayList1<>();
    list.add(5);
    list.add(9);
    list.add(11);
    list.add(3);
    list.add(7);

    for(int i = 0; i <= list.size(); i++) {
      System.out.println("index " + (i + 1) + " has value = " + list.get(i));
    }
  }
}
