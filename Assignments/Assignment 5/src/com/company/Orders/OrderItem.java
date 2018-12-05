package com.company.Orders;

import com.company.Menus.MenuItem;

public class OrderItem {
    private int itemNumber;

    public OrderItem() {
        itemNumber = 0;
    }

    public OrderItem(int number){
        itemNumber = number;
    }

    public int getItemNumber() {
        return itemNumber;
    }
}
