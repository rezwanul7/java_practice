package com.rezwanul7.design_patterns.creational.builder;

import com.rezwanul7.design_patterns.creational.builder.launch_order.LunchOrder;

public class LunchOrderBuilderTest {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder("Wheat")
                .setCondiments("Lettuce")
                .setDressing("Mustard")
                .setMeat("Ham");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder);
    }
}
