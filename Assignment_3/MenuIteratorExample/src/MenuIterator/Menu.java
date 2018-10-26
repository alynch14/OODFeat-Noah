package MenuIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    private List<MenuItem> originalListOfItems;

     /**
      * Iterator that will iterate over all of the items sent to it.
      */
    private class AllItemsIterator implements MenuIterator{
        private List<MenuItem> listOfItems;
        private int index;

        public AllItemsIterator(){
            listOfItems = new ArrayList<>();
            index = 0;
        }

        public AllItemsIterator(List<MenuItem> newList){
            listOfItems.addAll(newList);
            index = 0;
        }

        public AllItemsIterator(MenuItem[] array){
            listOfItems = new ArrayList<>();
            listOfItems.addAll(Arrays.asList(array));
            index = 0;
        }

        @Override
        public boolean hasNext(){
            return (index+1)<listOfItems.size();
        }

        @Override
        public MenuItem next(){
            index++;
            return listOfItems;
        }
    }

    /**
     * Iterator that iterates over items of the specific category that the
     * user enters in.
     */
    private class ItemIterator implements MenuIterator{
        private List<MenuItem> listOfItems;
        private int index;

        public ItemIterator(){
            listOfItems = new ArrayList<>();
            index = 0;
        }

        public ItemIterator(List<MenuItem> newList, int category){
            for(MenuItem item : newList){
                if(item.getCategory() == category){
                    listOfItems.add(item);
                }
            }
            index = 0;
        }

        public ItemIterator(MenuItem[] array, int category){
            listOfItems = new ArrayList<>();
            for(int i = 0; i < array.length; i++){
                if(array[i].getCategory() == category){
                    listOfItems.add(array[i]);
                }
            }
            index = 0;
        }

        @Override
        public boolean hasNext(){
            return (index + 1) < listOfItems.size();
        }

        @Override 
        public MenuItem next(){
            index++;
            return listOfItems.get(index);
        }
    }

    /**
     * Iterator that separates the non-healthy items out of the list 
     * and iterates over only the healthy ones.
     */
    private class HeartHealthyIterator implements MenuIterator{
        private List<MenuItem> listOfItems;
        private int index;

        public HeartHealthyIterator(){
            listOfItems = new ArrayList<>();
            index = 0;
        }

        public HeartHealthyIterator(List<MenuItem> newList){
            for(MenuItem item : newList){
                if(item.getHealthy()){
                    listOfItems.add(item);
                }
            }
            index = 0;
        }
        
        public HeartHealthyIterator(MenuItem[] array){
            listOfItems = new ArrayList<>();
            for(int i = 0; i < array.length; i++){
                if(array[i].getHealthy()){
                    listOfItems.add(array[i]);
                }
            }
            index = 0;
        }

        @Override
        public boolean hasNext(){
            return (index + 1) < listOfItems.size();
        }

        @Override
        public MenuItem next(){
            index++;
            return listOfItems.get(index);
        }
    }

    /**
     * Iterator that sorts out the items that are over the price ceiling that the user sets,
     * and iterates only over the items that are less.
     */
    private class PriceIterator implements MenuIterator{
        private List<MenuItem> listOfItems;
        private int index;

        public PriceIterator(){
            listOfItems = new ArrayList<>();
            index = 0;
        }

        public PriceIterator(List<MenuItem> newList, double ceiling){
            for(MenuItem item : newList){
                if(item.getPrice() < ceiling){
                    listOfItems.add(item);
                }
            }
            index = 0;
        }

        public PriceIterator(MenuItem[] array, double ceiling){
            listOfItems = new ArrayList<>();
            for(int i = 0; i < array.length; i++){
                if(array[i].getPrice()<ceiling){
                    listOfItems.add(array[i]);
                }
            }
            index = 0;
        }

        @Override
        public boolean hasNext(){
            return (index + 1) < listOfItems.size();
        }

        @Override
        public MenuItem next(){
            index++;
            return listOfItems.get(i);
        }
    }
    //End of Iterators

    public Menu(){
        originalListOfItems = new ArrayList<>();
    }

    public void addItem(MenuItem item){

    }

    public void deleteItem(MenuIterator iter, MenuItem itemToDelete){
        
    }

    public MenuIterator getAllItemsIterator(){
        return new AllItemsIterator(originalListOfItems);
    }

    public MenuIterator getItemIterator(int itemType){
        return new ItemIterator(originalListOfItems, itemType);
    }

    public MenuIterator getHeartHealthyIterator(){
        return new HeartHealthyIterator(originalListOfItems);
    }

    public MenuIterator getPriceIterator(double priceCeiling){
        return new PriceIterator(originalListOfItems, priceCeiling);
    }
}
