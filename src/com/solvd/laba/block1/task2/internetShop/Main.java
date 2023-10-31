package com.solvd.laba.block1.task2.internetShop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("A", BigDecimal.valueOf(35));
        Product product2 = new Product("B", BigDecimal.valueOf(50));
        Product product3 = new Product("C", BigDecimal.valueOf(75));
        Product product4 = new Product("D", BigDecimal.valueOf(85));
        Product product5 = new Product("E", BigDecimal.valueOf(100));
        Product product6 = new Product("F", BigDecimal.valueOf(200));

        OrderPosition orderPosition1 = new OrderPosition(product1, 3, new BigDecimal("0.01"));
        OrderPosition orderPosition2 = new OrderPosition(product2, 5, new BigDecimal("0.1"));
        OrderPosition orderPosition3 = new OrderPosition(product3, 2, new BigDecimal("0.05"));
        OrderPosition orderPosition4 = new OrderPosition(product4, 2, new BigDecimal("0.4"));
        OrderPosition orderPosition5 = new OrderPosition(product5, 7, new BigDecimal("0.1"));
        OrderPosition orderPosition6 = new OrderPosition(product6, 4, new BigDecimal("0.05"));

        Order order1 = new Order(new OrderPosition[]{orderPosition1, orderPosition2});
        Order order2 = new Order(new OrderPosition[]{orderPosition3, orderPosition4});
        Order order3 = new Order(new OrderPosition[]{orderPosition5, orderPosition6});

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        Order[] orders = new Order[]{order1, order2, order3};
        OrdersManager ordersManager = new OrdersManager(orders);
        System.out.println(ordersManager);
    }
}
