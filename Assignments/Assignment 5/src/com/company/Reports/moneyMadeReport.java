package com.company.Reports;

import com.company.Menus.Menu;
import com.company.Menus.MenuItem;

import java.util.*;

public class moneyMadeReport {
    moneyMadeReport(Menu menu) {
        List<MenuItem> list = menu.getItemList();
        double total = 0;
        Object[] listArray = list.toArray();
        List<String> descriptionList = new ArrayList<>();
        for (int i = 0; i < listArray.length; i++) {
            total = list.get(i).getCost() + total;
        }
        System.out.println("Total made: " + total);
    }
}
