package com.rezwanul7.streams.data.cart;

import java.math.BigDecimal;

public class OrderItem {
    private String name;
    private BigDecimal price;
    private Integer qty ;

    public OrderItem(String name, BigDecimal price, Integer qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
