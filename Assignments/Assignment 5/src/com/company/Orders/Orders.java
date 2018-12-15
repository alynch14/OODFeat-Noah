package com.company.Orders;

import com.company.CompositeTabPattern.AllTabsAndOrders;
import com.company.Menus.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Orders extends AllTabsAndOrders {
    private List<OrderItem> items;

    public Orders(){
        items = new ArrayList<>();
    }

    public void addOrderItem(MenuItem item, int tableNum){
        items.add(new OrderItem(item.getItemNumber()));
        super.addOrderItem(new OrderItem(item.getItemNumber()), tableNum);
    }

    public void removeOrderItem(MenuItem item){
        items.remove(item.getItemNumber());
    }

    public void submitOrder(){
        new Orders();
    }
}
