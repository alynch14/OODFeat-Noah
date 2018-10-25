package MenuIterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    private List<MenuItem> items;

    private class MenuIterator{

    }

    public Menu(){
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void deleteItem(MenuIterator iter){

    }
}
