package com.rezwanul7.collections;

import java.util.*;
import java.util.function.Consumer;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);

        collection.addAll(Arrays.asList(1,2,3));

        Collections.addAll(collection,9,10,11,12);

        collection.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer*2);
            }
        });

        System.out.println("This collection has 4 " + collection.contains(4));

        Collection<Integer> collection2 = Arrays.asList(2, 3, 4);
        Collection<Integer> collection3 = Arrays.asList(2, 3, 4,5);
        System.out.println(collection2.equals(collection3));
    }
}
