package com.rezwanul7.streams.operation_category;

import com.rezwanul7.streams.data.cart.OrderItem;

import java.math.BigDecimal;
import java.util.List;

public class SuppressElements {
    public static void main(String[] args) {
        List<OrderItem> orderItems = List.of(
                new OrderItem("Apple", new BigDecimal(30), 3),
                new OrderItem("Orange", new BigDecimal(25), 4),
                new OrderItem("WaterMelon", new BigDecimal(125), 2),
                new OrderItem("Guava", new BigDecimal(20), 5),
                new OrderItem("Malta", new BigDecimal(30), 7)
        );

        System.out.println("Limiting elements");
        orderItems.stream().limit(3).forEach(System.out::println);

        System.out.println("Skipping elements");
        orderItems.stream().skip(1).forEach(System.out::println);

        System.out.println("Filtering elements");
        orderItems
                .stream()
                .filter(orderItem -> orderItem.getPrice()
                        .multiply(
                                new BigDecimal(orderItem.getQty())
                        ).longValue() > 200)
                .forEach(System.out::println);

    }
}
