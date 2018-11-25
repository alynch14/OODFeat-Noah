import java.util.ArrayList;

public class PurchasedItems  {
    private ArrayList<StoreItem> items;

    public PurchasedItems() {
        items = new ArrayList();
    }

    public void addItem(StoreItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double total = 0;
        for(StoreItem item : items){
            System.out.println("Items (PI): "+item.getItemPrice());
            total +=  Double.valueOf(item.getItemPrice());//(double) Integer.parseInt(item.getItemPrice());
        }
        return total;
    }

    public ArrayList<StoreItem> getItems() {
        return items;
    }

    public boolean containsItem(String itemCode) {
        for(StoreItem item : items){
            if(item.getItemCode().equals(itemCode)){
                return true;
            }
        }
        return false;
    }

    public int size() {
        int size=items.size();
        return size;
    }
}