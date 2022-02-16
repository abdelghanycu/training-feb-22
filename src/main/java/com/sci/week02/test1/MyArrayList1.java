package com.sci.week02.test1;

public class MyArrayList1<T> {

  private Object[] data;
  private int cursor;
  private int capacity;

  public MyArrayList1() {
    capacity = 1;
    cursor = -1;
    data = new Object[capacity];
  }

  public MyArrayList1(int capacity) {
    this.capacity = capacity;
    cursor = -1;
    data = new Object[capacity];
  }

  public void add(T element) {
    if (cursor == data.length - 1) {
      copy();
    }
    data[++cursor] = element;
  }

  public T get(int index) {
    if(index < 0 || index > cursor) {
      throw new IndexOutOfBoundsException("any message");
    }
    return (T) data[index];
  }

  public int size() {
    return cursor + 1;
  }

  private void copy() {
    Object[] tmp = new Object[capacity * 2];
    for (int i = 0; i < data.length; i++) {
      tmp[i] = data[i];
    }
    data = tmp;
    capacity *= 2;
  }
}
