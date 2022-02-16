package com.sci.week02.test2;

public class Test2 {

  public static void main(String[] args) {
    LinkedList2<Double> list = new LinkedList2<>();

    list.addLast(5.6);
    list.addLast(1.2);
    list.addLast(3.8);
    list.addLast(9.02);
    list.addLast(7.7);


    list.addFirst(66.66);

//    list.print();

    for(int i = 0; i < list.getSize(); i++) {
      System.out.println("element at index " + (i + 1) + " = " + list.get(i));
    }
  }
}
