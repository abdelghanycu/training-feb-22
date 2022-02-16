package com.sci.week02.test3;

public class BinaryTree3 {

  private Node3 root;

  public void add(int val) {
    if (root == null) {
      root = new Node3(val, null, null);
    } else {
      add(val, root);
    }
  }

  private void add(int val, Node3 current) {
    if (current.getData() == val) {
      return;
    } else if (current.getData() > val) {
      if (current.getLeft() == null) {
        current.setLeft(new Node3(val, null, null));
      } else {
        add(val, current.getLeft());
      }
    } else {
      if (current.getRight() == null) {
        current.setRight(new Node3(val, null, null));
      } else {
        add(val, current.getRight());
      }

    }
  }

  public void printIn() {
    in(root);
  }

  public void printPre() {
    pre(root);
  }

  public void printPost() {
    post(root);
  }

  private void in(Node3 current) {
    if (current == null) {
      return;
    }
    in(current.getLeft());
    System.out.println(current.getData());
    in(current.getRight());
  }

  private void pre(Node3 current) {
    if (current == null) {
      return;
    }
    System.out.println(current.getData());
    pre(current.getLeft());
    pre(current.getRight());
  }

  private void post(Node3 current) {
    if (current == null) {
      return;
    }
    post(current.getLeft());
    post(current.getRight());
    System.out.println(current.getData());
  }
}
