package com.company.CompositeTabPattern;

import com.company.Orders.OrderItem;

import java.util.HashMap;

public class AllTabsAndOrders {
    private HashMap<Integer, Tab> tabs;
    private HashMap<Integer, OrderItem> orders;

    public AllTabsAndOrders() {
        tabs = new HashMap<>();
        orders = new HashMap<>();
    }

    public void addOrderItem(OrderItem item, int table) {
        orders.put(table, item);
//        tabs.put(table, )
    }
}
