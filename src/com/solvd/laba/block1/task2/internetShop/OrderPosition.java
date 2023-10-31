package com.solvd.laba.block1.task2.internetShop;

import java.math.BigDecimal;
import java.util.Objects;

public class OrderPosition {
    private final Product product;
    private final int quantity;
    private final BigDecimal discount;

    public OrderPosition(Product product, int quantity, BigDecimal discount) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "%s QUANTITY: %d, DISCOUNT: %s".formatted(product.toString(), quantity, discount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPosition that = (OrderPosition) o;

        if (quantity != that.quantity) return false;
        if (!Objects.equals(product, that.product)) return false;
        return Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + quantity;
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        return result;
    }
}
