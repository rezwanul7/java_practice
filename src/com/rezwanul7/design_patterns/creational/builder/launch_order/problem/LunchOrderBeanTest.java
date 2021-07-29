package com.rezwanul7.design_patterns.creational.builder.launch_order.problem;

public class LunchOrderBeanTest {
    public static void main(String[] args) {
        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");

        System.out.println(lunchOrderBean);
    }
}
