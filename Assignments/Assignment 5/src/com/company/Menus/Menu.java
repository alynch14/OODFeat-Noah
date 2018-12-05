package com.company.Menus;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> itemList;

    public Menu() {
        itemList = new ArrayList<>();
    }

    public void addMenuItem(int number, String description, double price){
        itemList.add(new MenuItem(number, description, price));
    }

    public void displayMenu(){
        for(MenuItem item : itemList){
            System.out.println(item);
        }
    }
}
