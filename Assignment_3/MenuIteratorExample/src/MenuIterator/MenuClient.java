package MenuIterator;

import java.util.Scanner;

public class MenuClient {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int choice = 1;
        MenuIterator iter;
        boolean printMenu = true;

        initializeMenu(menu);
        //Initial printing of the menu
        iter = menu.getAllItemsIterator();
        printMenu(menu, iter);

        while(choice != 0){
            System.out.println("What would you like to do?\n------------------------");
            displayOptions();
            choice = getInt(input, "");

            switch(choice){
                case 1:
                    iter = menu.getAllItemsIterator();
                    System.out.println("\nMain Menu:\n-------------------------");
                    break;
                case 2:
                    int category = getInt(input, "Please enter the category of dishes you would like to see: ");
                    iter = menu.getItemIterator(category); 
                    System.out.println("\nMenu:\n-------------------------");
                    break;
                case 3:
                    iter = menu.getHeartHealthyIterator();
                    System.out.println("\nHeart Healthy Menu:\n-------------------------");
                    break;
                case 4:
                    iter = menu.getPriceIterator(getInt(input, "What is your budget?"));
                    System.out.println("\nBudget Menu:\n-------------------------");
                    break;
                case 5:
                    addMenuItem(input, menu);
                    System.out.println("\nUpdated Menu:\n------------------------");
                    break;
                case 6:
                    deleteMenuItem(input, menu);
                    System.out.println("\nUpdated Menu:\n------------------------");
                    break;
                default:
                    break;
            }
            
            if(printMenu){
                printMenu(menu,iter);
            }
        }
    }

    public static void initializeMenu(Menu myMenu){
        myMenu.addItem(new MenuItem("Spaghetti", Menu.HEART_HEALTHY, Menu.MAIN_DISH, 7.5));
        myMenu.addItem(new MenuItem("Hamburger", Menu.NOT_HEART_HEALTHY, Menu.MAIN_DISH, 6.25));
        myMenu.addItem(new MenuItem("Side Caesar", Menu.HEART_HEALTHY, Menu.APPETIZERS, 5.11));
        myMenu.addItem(new MenuItem("Cheesecake", Menu.NOT_HEART_HEALTHY, Menu.DESSERT, 8.75));
        myMenu.addItem(new MenuItem("Steak", Menu.HEART_HEALTHY, Menu.MAIN_DISH, 12.99));
        myMenu.addItem(new MenuItem("Buffalo Wings", Menu.NOT_HEART_HEALTHY, Menu.APPETIZERS, 5.45));
        myMenu.addItem(new MenuItem("Pound Cake", Menu.NOT_HEART_HEALTHY, Menu.DESSERT, 7.50));
    }

    public static void printMenu(Menu myMenu, MenuIterator iter){
        MenuItem currentItem = iter.next();

        while(iter.hasNext()){
            System.out.println(currentItem);
            currentItem = iter.next();
        }
    }

    public static void displayOptions(){
        System.out.println("Your options for matrix operations are:\n" +
        "----------------------------------------\n" + 
        "1) Print the current Menu\n"+ 
        "2) Print specific types of dishes from the current menu\n" + 
        "3) Print the heart healthy dishes on the menu\n" + 
        "4) Print the dishes below your budget\n" +
        "5) Add an item\n" + 
        "6) Delete an item\n" + 
        "0) EXIT\n" +
        "Please enter your choice:");
    }

    public static int getInt(Scanner in, String message){
        System.out.println(message);

        while(!in.hasNextInt()){
            in.next();

            System.out.println("Not an integer value! Try again: ");
        }

        return in.nextInt();
    }

    public static void addMenuItem(Scanner in, Menu myMenu){
        String name;
        boolean healthy;
        int category;
        double price;

        System.out.println("Please enter the name of the dish: ");
        name = in.nextLine();
        System.out.println("Please enter whether the dish is healthy or not (only the first letter will be read):");
        healthy = in.nextLine().charAt(0) == t;
        System.out.println("Please enter what kind of dish this is (use numbers 1-3):");
        category = in.nextInt();
        System.out.println("Please enter the price for the dish: ");
        price = in.nextDouble();

        myMenu.addItem(new MenuItem(name, healthy, category, price));
    }

    public static void deleteMenuItem(Scanner in, Menu myMenu){
        String name;
        boolean healthy;
        int category;
        double price;

        System.out.println("Please enter the name of the dish: ");
        name = in.nextLine();
        System.out.println("Please enter whether the dish is healthy or not (only the first letter will be read):");
        healthy = in.nextLine().charAt(0) == t;
        System.out.println("Please enter what kind of dish this is (use numbers 1-3):");
        category = in.nextInt();
        System.out.println("Please enter the price for the dish: ");
        price = in.nextDouble();

        myMenu.deleteItem(new MenuItem(name, healthy, category, price));
    }
}
