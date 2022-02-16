package com.sci.week02.test0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Test0 {

  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int[] arr = new int[n];
//    for(int i = 0; i < n; i++) {
//      arr[i] = in.nextInt();
//    }

    Node0<Character> node0 = new Node0<>();
    Node0 node09 = new Node0();
    Node0<Character> node01 = new Node0<>("any string", 'V');

    List<Integer> list = new ArrayList<>();
    List list1 = new ArrayList();

    LinkedList<Float> linkedList = new LinkedList<>();
    linkedList.add(45.6f);

    Stack<String> st = new Stack<>();
    st.push("fdgas");
    st.push("dfsa");
    st.push("asdf");

    st.pop();

    Queue<String> qu = new LinkedList<>();

    qu.add("fdsa");
    qu.add("t");
    qu.add("u");

    qu.poll();

    System.out.println("*******************************");

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    pq.add(7);
    pq.add(3);
    pq.add(9);
    pq.add(4);

    System.out.println(pq.peek());

    Vector<Integer> vec = new Vector<>();
    vec.add(5);
    vec.add(6);
    vec.add(8);
    vec.add(1);

  }
}
