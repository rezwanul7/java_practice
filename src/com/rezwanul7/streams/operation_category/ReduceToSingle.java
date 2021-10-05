package com.rezwanul7.streams.operation_category;

import com.rezwanul7.streams.data.cart.OrderItem;

import java.math.BigDecimal;
import java.util.List;

public class ReduceToSingle {
    public static void main(String[] args) {
        List<OrderItem> orderItems = List.of(
                new OrderItem("Apple", new BigDecimal(30), 3),
                new OrderItem("Orange", new BigDecimal(25), 4),
                new OrderItem("WaterMelon", new BigDecimal(125), 2),
                new OrderItem("Guava", new BigDecimal(20), 5),
                new OrderItem("Malta", new BigDecimal(30), 7)
        );

        //total price
        BigDecimal totalPrice = orderItems.stream()
                .map(orderItem -> orderItem.getPrice().multiply(new BigDecimal(orderItem.getQty())))
                .reduce(BigDecimal.ZERO, (total, price) -> total.add(price));

        System.out.println("total price: " + totalPrice);
    }
}
