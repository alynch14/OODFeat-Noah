package com.company.CommandPattern;

import com.company.CoreClasses.Tab;
import com.company.Menus.Menu;
import com.company.Orders.Orders;

public class Aggregator {
    private Menu myMenu;
    private Orders myOrders;
    private Tab myTab;

    public Aggregator(){
        myMenu = new Menu();
        myOrders = new Orders();
        myTab = new Tab();
    }

    public Menu getMyMenu() {
        return myMenu;
    }

    public Orders getMyOrders() {
        return myOrders;
    }
}
