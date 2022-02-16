package com.sci.week02.test3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node3 {

  private int data;
  private Node3 right;
  private Node3 left;
}
