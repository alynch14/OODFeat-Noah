package MenuIterator;

public class MenuItem {
    private String name;
    private boolean healthy;
    private int category;
    private double price;

    public MenuItem(String name, boolean healthy, int category, double price){
        this.name = name;
        this.healthy = healthy;
        this.category = category;
        this. price = price;
    }

    public String getName(){
        return name;
    }

    public boolean getHealthy(){
        return healthy;
    }

    public int getCategory(){
        return category;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return new String(name + " - " + price);
    }
}
