package com.solvd.laba.block1.task2.internetShop;

import java.util.Arrays;

public class Order {
    private final OrderPosition[] orderPositions;

    public Order(OrderPosition[] orderPositions) {
        this.orderPositions = orderPositions;
    }

    @Override
    public String toString() {
        return "ORDERS: %s".formatted(Arrays.toString(orderPositions));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(orderPositions, order.orderPositions);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(orderPositions);
    }
}
