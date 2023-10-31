package com.solvd.laba.block1.task2.internetShop;

import java.util.Arrays;

public class OrdersManager {
    private final Order[] orders;

    public OrdersManager(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String
    toString() {
        return "ORDERS MANAGER: %s".formatted(Arrays.toString(orders));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersManager that = (OrdersManager) o;
        return Arrays.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(orders);
    }
}
