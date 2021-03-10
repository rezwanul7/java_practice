package com.company.collections;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("d");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("c");
//        System.out.println(list.contains("a"));
        System.out.println(list.indexOf("c"));
//        System.out.println(list.remove("c"));

        list.sort((o1, o2) -> o1.compareTo(o2));
//        System.out.println(list.removeAll(Arrays.asList("c")));
        System.out.println(list);
    }
}
