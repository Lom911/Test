package com.example.demo.javacode.thread.ds;


import java.util.LinkedList;
import java.util.List;

public class ListEx {

  public static List<Integer> list = new LinkedList<>();

  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    ListEx.list = list;
  }
}
