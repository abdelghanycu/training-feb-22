package com.sci.week02.test3;

public class Test3 {

  public static void main(String[] args) {
    BinaryTree3 tree = new BinaryTree3();

    tree.add(5);
    tree.add(7);
    tree.add(3);
    tree.add(4);
    tree.add(1);

    System.out.println("************ IN ***********");
    tree.printIn();
    System.out.println("*********** PRE ************");
    tree.printPre();
    System.out.println("************ POST ***********");
    tree.printPost();
  }
}
