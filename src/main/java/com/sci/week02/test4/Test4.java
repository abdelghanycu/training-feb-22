package com.sci.week02.test4;

public class Test4 {

  public static void main(String[] args) {
    HashTable hashTable = new HashTable();
    hashTable.add("abcd");
    System.out.println(hashTable.isExist("abcd"));
    System.out.println(hashTable.isExist("aace"));
    System.out.println(hashTable.isExist("abdc"));
  }
}
