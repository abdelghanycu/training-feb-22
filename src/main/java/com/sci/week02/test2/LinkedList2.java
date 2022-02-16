package com.sci.week02.test2;

import lombok.Getter;

public class LinkedList2<T> {

  private Node2<T> head;
  private Node2<T> tail;
  @Getter
  private int size;

  public void addFirst(T ele) {
    Node2<T> val = new Node2<>(ele, null);
    if (head == null) {
      head = tail = val;
    } else {
      val.setNext(head);
      head = val;
    }
    size++;
  }

  public void addLast(T ele) {
    Node2<T> val = new Node2<>(ele, null);
    if (head == null) {
      head = tail = val;
    } else {
      tail.setNext(val);
      tail = val;
    }
    size++;
  }

  public void print() {
    Node2<T> current = head;
    while (current != null) {
      System.out.println(current.getData());
      current = current.getNext();
    }
  }

  public T get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("any message");
    }
    Node2<T> current = head;
    int currentIndex = 0;
    while (currentIndex != index) {
      current = current.getNext();
      currentIndex++;
    }
    return current.getData();
  }
}
