package com.company.Menus;

public class MenuItem {
    private int itemNumber;
    private String description;
    private double cost;

    public MenuItem(){
        itemNumber = 0;
        description = null;
        cost = 0.0;
    }

    public MenuItem(int num, String description, double cost){
        itemNumber = num;
        this.description = description;
        this.cost = cost;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getDescription(){
        return description;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString(){
        return String.format("%d\n%s\n$%.2f", itemNumber, description, cost);
    }
}
