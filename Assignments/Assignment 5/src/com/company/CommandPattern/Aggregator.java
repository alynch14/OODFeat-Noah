package com.company.CommandPattern;

import com.company.Menus.Menu;
import com.company.Orders.Orders;

public class Aggregator {
    private Menu myMenu;
    private Orders myOrders;

    public Aggregator(){
        myMenu = new Menu();
        myOrders = new Orders();
    }

    public Menu getMyMenu() {
        return myMenu;
    }

    public Orders getMyOrders() {
        return myOrders;
    }
}
