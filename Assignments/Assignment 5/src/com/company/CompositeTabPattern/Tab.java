package com.company.CompositeTabPattern;

import com.company.Menus.Menu;
import com.company.Orders.Orders;

import java.util.ArrayList;
import java.util.Iterator;

public class Tab  extends AllTabsAndOrders {
    private Orders orders;
    private Menu menu;
    Iterable<? extends Orders> orderList;
    ArrayList stringTab;

    public void displayTab() {
        for (Orders orders : orderList) {
            System.out.println(orders);
        }
    }

    public ArrayList tabString() {
        Iterator iterator = orderList.iterator();
        while (iterator.hasNext()) {
            stringTab.add(iterator.toString());
        }
        return stringTab;
    }

    @Override
    public void addTabItem(int table, Tab tab) {
        super.addTabItem(table, tab);
    }
}
