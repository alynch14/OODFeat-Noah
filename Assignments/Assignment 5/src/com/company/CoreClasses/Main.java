package com.company.CoreClasses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int choice = 0;

        printOptionsMenu();
        choice = getInt(input);

        switch(choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }
    }

    public static void printOptionsMenu(){
        System.out.println("Please enter which command you would like to execute: ");
        System.out.println("-----------------------------------------------------");
        System.out.print("1) Display Menu\n2) Submit Order\n3) Display Tab\n");
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
