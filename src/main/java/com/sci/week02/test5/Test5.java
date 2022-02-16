package com.sci.week02.test5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test5 {

  public static void main(String[] args) {

    Set<Integer> set1 = new HashSet<>();
    set1.add(8);
    set1.add(6);
    set1.add(3);

    Set<Integer> set2 = new TreeSet<>();
    set2.add(8);
    set2.add(6);
    set2.add(3);

    Map<String, Double> map1 = new HashMap<>();
    map1.put("abdelghany", 56.9);
    map1.put("ahmed", 57.9);
    map1.put("ali", 66.1);
    map1.put("mona", 23.16);

    Map<String, Double> map2 = new TreeMap<>();
    map2.put("abdelghany", 56.9);
    map2.put("ahmed", 57.9);
    map2.put("ali", 66.1);
    map2.put("mona", 23.16);
  }
}
