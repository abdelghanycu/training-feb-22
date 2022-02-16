package com.sci.week02.test4;

public class HashTable {

  private String[] data;
  private int sz = (int) 1e5 + 9;

  public HashTable() {
    data = new String[sz];
  }

  public void add(String key) {
    data[hashKey(key)] = key;
  }

  public boolean isExist(String key) {
    return data[hashKey(key)] != null;
  }

  public int hashKey(String key) {
    int res = 0;
    for (int i = 0; i < key.length(); i++) {
      res = (res + (key.charAt(i) - 'a') * i) % sz;
    }
    return res;
  }
}
