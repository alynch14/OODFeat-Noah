package com.company.CoreClasses;

import com.company.CommandPattern.Aggregator;
import com.company.CommandPattern.DisplayMenuCommand;
import com.company.CommandPattern.Invoker;
import com.company.CommandPattern.SubmitOrderCommand;
import com.company.CompositeTabPattern.Tab;
import com.company.Menus.Menu;
import com.company.Menus.MenuItem;
import com.company.Orders.OrderItem;
import com.company.Orders.Orders;
import com.company.Reports.Reports;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Orders orders=new Orders();
        Scanner input = new Scanner(System.in);
        int choice = -1;
        Tab tab= new Tab();
        Aggregator aggregate = new Aggregator();
        Invoker invoke = new Invoker();
        DisplayMenuCommand showMenu = new DisplayMenuCommand(aggregate.getMyMenu());
        SubmitOrderCommand submitOrder = new SubmitOrderCommand(aggregate.getMyOrders());
        Menu menu = new Menu();
        while (choice != 0) {
            printOptionsMenu();
            choice = getInt(input);

            switch (choice) {
                case 1:
                    invoke.setCommand(showMenu);
                    invoke.invokeCommand();
                    break;
                case 2:
                    MenuItem menuItem=new MenuItem();
                    OrderItem orderItem=new OrderItem();
//                    System.out.println("Enter in the number of the food");
//                    int num = input.nextInt();
//                    System.out.println("Enter in the description of the food");
//                    String descrip = input.nextLine();
//                    System.out.println("Enter in the price of the food");
//                    Double price= input.nextDouble();
                    System.out.println("Enter the food number: ");
                    int foodNum = input.nextInt();
                    System.out.println("Enter the table for the order: ");
                    int tableNum = input.nextInt();
                    orderItem.getItemNumber();
                    orders.addOrderItem(menuItem,tableNum);
                    break;
                    case 3:
                    invoke.setCommand(submitOrder);
                    invoke.invokeCommand();
                    System.out.println("Order successfully submitted!");
                    break;
                case 4:
                    tab.displayTab();
                    break;
                case 5:
                    new Reports();
                    break;
                case 6:
                    break;
                case 7:
                    break;
                    default:
                        break;
            }
        }
    }

    public static void printOptionsMenu(){
        System.out.println("Please enter which command you would like to execute: ");
        System.out.println("-----------------------------------------------------");
        System.out.print("1) Display Menu\n2) Create Order\n3) Submit Order\n4) Display Tab\n5) Display Reports\n6) Display Tabs\n7) Display Orders\n0) Exit Program\n");
        System.out.println("Please enter your choice: ");
    }

    public static int getInt(Scanner in) {
        while(!in.hasNextInt()){
            System.out.print("\nPlease enter an integer value.");
            in.next();
        }
        return in.nextInt();
    }
}
