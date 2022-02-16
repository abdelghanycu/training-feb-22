package com.sci.week02.test2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Node2<T> {

  private T data;
  private Node2<T> next;
}
