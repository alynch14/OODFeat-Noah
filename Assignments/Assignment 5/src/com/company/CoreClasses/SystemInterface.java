package com.company.CoreClasses;

import com.company.CommandPattern.Aggregator;
import com.company.Menus.Menu;
import com.company.Orders.Orders;

public class SystemInterface {
    private static Tab myTab;
    private static Menu myMenu;
    private static Orders myOrder;

    public SystemInterface(){

    }

    public static void displayMenu(){
        myMenu.displayMenu();
    }

    public static void submitOrder(){
        myOrder.submitOrder();
    }

    public static void displayTab(){
        myTab.displayTab();
    }
}
