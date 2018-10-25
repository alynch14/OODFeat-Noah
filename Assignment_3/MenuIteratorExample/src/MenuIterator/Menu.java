package MenuIterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    private MenuIterator iterator;

    /* So the assignment confused me, but it seemed like Lin
       recommended us use an inner class to create the MenuIterator
       so that's what I did here.
     */
    private class ListIterator implements MenuIterator{
        private List<MenuItem> myList;
        private int index;

        public ListIterator(List<MenuItem> list){
            myList.addAll(list);
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return (index+1)<myList.size();
        }

        @Override
        public MenuItem next() {
            index++;
            return myList.get(index);
        }
    }

    private class ArrayIterator implements MenuIterator{
        private MenuItem[] array;
        private int index;

        public ArrayIterator(MenuItem[] newArray){
            array = new MenuItem[newArray.length];
            index = 0;
            int i = 0;
            for(MenuItem item : newArray){
                array[i] = item;
                i++;
            }
        }

        @Override
        public boolean hasNext() {
            return (index+1)<array.length;
        }

        @Override
        public MenuItem next() {
            index++;
            return array[index];
        }
    }

    public void addItem(MenuItem item){
    }

    public void deleteItem(MenuIterator iter, MenuItem itemToDelete){
        if(){

        }
    }

    public void AllItemsIterator(){

    }

    public void itemIterator(int itemType){

    }

    public void heartHealthyIterator(){

    }

    public void priceIterator(){

    }
}
