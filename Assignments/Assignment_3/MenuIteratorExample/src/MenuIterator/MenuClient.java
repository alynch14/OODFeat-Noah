package MenuIterator;

public class MenuItem {
    private String name;
    private boolean healthy;
    private int category;
    private double price;

    public MenuItem(String name, boolean healthy, int category, double price) {
        this.name = name;
        this.healthy = healthy;
        this.category = category;
        this.price = price;
    }

    public MenuItem(Object obj) {
    }

    public String getName() {
        return name;
    }

    public boolean getHealthy() {
        return healthy;
    }

    public int getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return new String(name + " - " + price);
    }

    @Override
    public boolean equals(Object obj) {
//MenuItem item = (obj.typeof(MenuItem.class))? new MenuItem(obj): null;
        MenuItem item = (obj.getClass().equals(MenuItem.class)) ? new MenuItem(obj) : null;
        return (item != null && name == item.name && healthy == item.healthy && category == item.category && price == item.price);
    }
}
