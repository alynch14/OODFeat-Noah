package com.company.Reports;
import com.company.CoreClasses.Main;
import com.company.Menus.Menu;
import com.company.Orders.Orders;

import java.util.Scanner;

import static java.lang.System.in;
import static jdk.javadoc.internal.tool.Main.main;

public class Reports {
    Menu myMenu;
    Scanner input = new Scanner(System.in);
    public Reports() {
        generateReportsMenu();

        int choice = getInt(input);
        switch (choice) {
            case 1:
                new soldFoodReport(myMenu);
                break;
            case 2:
                new moneyMadeReport(myMenu);
                break;
            case 3:
                break;
            default:
        }
    }
        private void generateReportsMenu () {
            System.out.println("Please which report you would like to view: ");
            System.out.println("-----------------------------------------------------");
            System.out.print("1) Food Sold\n2) Submit Order\n 0} Exit Reports\n");
            System.out.println("Please enter your choice: ");
        }
        public static int getInt(Scanner in) {
            while (!in.hasNextInt()) {
                System.out.print("\nPlease enter an integer value.");
                in.next();
            }
            return in.nextInt();
        }
    }
