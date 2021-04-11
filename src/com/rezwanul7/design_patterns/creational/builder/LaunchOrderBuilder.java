package com.rezwanul7.design_patterns.creational.builder;

public class LaunchOrderBuilder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LaunchOrderBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public LaunchOrderBuilder setCondiments(String condiments) {
        this.condiments = condiments;
        return this;
    }

    public LaunchOrderBuilder setDressing(String dressing) {
        this.dressing = dressing;
        return this;
    }

    public LaunchOrderBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }
}
