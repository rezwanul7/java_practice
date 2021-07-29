package com.rezwanul7.design_patterns.creational.builder.launch_order.problem;

public class LunchOrderTelescoping {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTelescoping(String bread) {

    }

    public LunchOrderTelescoping(String bread, String condiments, String dressing, String meat) {
        this(bread,condiments);
        this.dressing = dressing;
        this.meat = meat;
    }

    public LunchOrderTelescoping(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTelescoping(String bread, String condiments, String dressing) {
        this(bread,condiments);
        this.dressing = dressing;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return "LaunchOrderBean{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
