package com.company.collections;

public class IterableTest {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (Integer item : list) {
            System.out.println(item+"");
        }
    }
}
