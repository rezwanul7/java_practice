package com.rezwanul7.streams;

import com.rezwanul7.streams.data.cart.OrderItem;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OrderItemStreamTest {
    public static void main(String[] args) {

        List<OrderItem> orderItems = List.of(
                new OrderItem("Apple", new BigDecimal(30), 3),
                new OrderItem("Orange", new BigDecimal(25), 4),
                new OrderItem("WaterMelon", new BigDecimal(125), 2),
                new OrderItem("Guava", new BigDecimal(20), 5),
                new OrderItem("Malta", new BigDecimal(30), 7)
        );

        //Intermediate operations

        //movies having likes > 15
        Stream<OrderItem> highPriceItems = orderItems.stream().
                filter(orderItem -> orderItem.getPrice().compareTo(new BigDecimal(50)) > 0);

        //first 3
        Optional<OrderItem> first = orderItems.stream().findAny();

        //terminal
        System.out.println(first.get());


        //total price
        BigDecimal totalPrice = orderItems.stream()
                .map(orderItem -> orderItem.getPrice().multiply(new BigDecimal(orderItem.getQty())))
                .reduce(BigDecimal.ZERO, (total, price) -> total.add(price));

        System.out.println("total: " + totalPrice);

        //Terminal Operations
        highPriceItems.forEach(orderItem -> {
            System.out.println(orderItem);
        });


    }
}
