package com.company.Reports;

import com.company.Menus.Menu;
import com.company.Menus.MenuItem;

import java.util.*;

public class soldFoodReport {
    private static final java.util.Collections Collections = null;

    public soldFoodReport(Menu menu) {
        List<MenuItem> list = menu.getItemList();
        Object[] listArray = list.toArray();
        List<String> descriptionList = new ArrayList<>();
        for (int i=0; i<listArray.length; i++)
        {
            descriptionList.add(list.get(i).getDescription().toString());
        }
        Set<String> unique = new HashSet<String>(descriptionList);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(list, key));
        }
    }
}