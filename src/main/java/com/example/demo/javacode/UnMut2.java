package com.example.demo.javacode;

import java.util.LinkedList;
import java.util.List;

public final class UnMut2 {

    private final List<String> list;

    public UnMut2(List<String> list) {
        List<String> unlist = new LinkedList<>();
        for (String s : list) {
            unlist.add(s);
        }
        this.list = unlist;
    }

    public List<String> getList() {
        List<String> unlist = new LinkedList<>();
        for (String s : list) {
            unlist.add(s);

        }
        return unlist;
    }
}
