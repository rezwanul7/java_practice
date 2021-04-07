package com.rezwanul7.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.offer("d");
        System.out.println(queue);

        String element = queue.element();
        System.out.println(element);

        String peeked = queue.peek();
        System.out.println(peeked);

        //poll gets the first element and removes it from the queue
        String poll = queue.poll();
        System.out.println(poll);
        System.out.println(queue);


    }
}
