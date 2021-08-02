package com.rezwanul7.design_patterns.creational.builder.launch_order;

public class LunchOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;


    private LunchOrder(Builder builder) {
        bread = builder.bread;
        condiments = builder.condiments;
        dressing = builder.dressing;
        meat = builder.meat;
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

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        //bread is a must
        public Builder(String bread) {
            this.bread = bread;
        }

        public Builder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }
    }
}
