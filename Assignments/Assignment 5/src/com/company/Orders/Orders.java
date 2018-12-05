package com.company.Orders;

import com.company.Menus.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<OrderItem> items;

    public Orders(){
        items = new ArrayList<>();
    }

    public void addOrderItem(MenuItem item){
        items.add(new OrderItem(item.getItemNumber()));
    }

    public List<OrderItem> getOrders(){
        return items;
    }
}
