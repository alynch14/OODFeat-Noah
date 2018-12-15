package com.company.CoreClasses;

import com.company.CommandPattern.Aggregator;
import com.company.CommandPattern.DisplayMenuCommand;
import com.company.CommandPattern.Invoker;
import com.company.CommandPattern.SubmitOrderCommand;
import com.company.CompositeTabPattern.Tab;
import com.company.Reports.Reports;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        Tab tab= new Tab();
        Aggregator aggregate = new Aggregator();
        Invoker invoke = new Invoker();
        DisplayMenuCommand showMenu = new DisplayMenuCommand(aggregate.getMyMenu());
        SubmitOrderCommand submitOrder = new SubmitOrderCommand(aggregate.getMyOrders());

        while (choice != 0) {
            printOptionsMenu();
            choice = getInt(input);

            switch (choice) {
                case 1:
                    invoke.setCommand(showMenu);
                    invoke.invokeCommand();
                    break;
                case 2:
                    invoke.setCommand(submitOrder);
                    invoke.invokeCommand();
                    break;
                case 3:
                    tab.displayTab();
                    break;
                case 4:
                    new Reports();
                    break;
                    default:
            }
        }
    }

    public static void printOptionsMenu(){
        System.out.println("Please enter which command you would like to execute: ");
        System.out.println("-----------------------------------------------------");
        System.out.print("1) Display Menu\n2) Submit Order\n3) Display Tab\n4) Display Reports\n0) Exit Program\n");
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
