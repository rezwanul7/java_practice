package com.rezwanul7.design_patterns.creational.builder.problem;

public class LaunchOrderBeanTest {
    public static void main(String[] args) {
        LaunchOrderBean launchOrderBean = new LaunchOrderBean();
        launchOrderBean.setBread("Wheat");
        launchOrderBean.setCondiments("Lettuce");
        launchOrderBean.setDressing("Mustard");
        launchOrderBean.setMeat("Ham");

        System.out.println(launchOrderBean);
    }
}
