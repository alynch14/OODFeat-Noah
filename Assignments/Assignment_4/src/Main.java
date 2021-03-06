import java.io.DataInput;
import java.util.Date;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PurchasedItems items = new PurchasedItems();
        System.out.println("Please enter the date of transaction MM/DD/YYYY: ");
        String dateString = input.nextLine();
        ReceiptDate date= new ReceiptDate(dateString);
//        System.out.println();
        ReceiptFactory factory = new ReceiptFactory();
        Receipt receipt = factory.getReceipt(date);
        PurchasedItems purchasedItems = new PurchasedItems();
        displayOptions();
        int choice=4;
        while (choice != 0) {
            System.out.println("----------------------------------------\n"
                    +"What would you like to do?\n"+
                    "----------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    items = new PurchasedItems();
                    receipt= factory.getReceipt(date);
                    break;
                case 2:
                    enterItem(input, factory, date);
                    break;
                case 3:
                    receipt.prtReceipt();
                    break;
                default:
                    break;
            }
            displayOptions();
        }
    }

    private static void enterItem(Scanner input, ReceiptFactory factory, ReceiptDate date) {
            input = new Scanner(System.in);
            String choice = "Y";
            while(choice.equals("Y") || choice.equals("y")){
                System.out.println("Enter an item code for purchase.");
                String code=input.nextLine();
                System.out.println("Enter an item for purchase.");
                String item = input.nextLine();
                System.out.println("Enter a price for purchase.");
                String price = input.nextLine();
                StoreItem itemBought = new StoreItem(code, item, price);
                factory.getReceipt(date).addItem(itemBought);
                System.out.println("Enter another item? Y/N");
                choice=input.nextLine();
            }

        }

    private static void displayOptions() {
        System.out.println("----------------------------------------\n" +
                "Your options for matrix operations are:\n" +
                "----------------------------------------\n" +
                "\n" +
                "1 – Start New Receipt\n" +
                "2 – Add Items\n" +
                "3 – Display Receipt\n");
    }
}
