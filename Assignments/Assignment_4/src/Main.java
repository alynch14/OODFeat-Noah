import java.io.DataInput;
import java.util.Date;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PurchasedItems items = null;
        ReceiptDate date = ReceiptDate.getDate();
        ReceiptFactory factory = new ReceiptFactory();
        Receipt receipt = (Receipt) factory.getReceipt(items, date);
        PurchasedItems purchasedItems = new PurchasedItems();
        displayOptions();
        int choice=4;
        while (choice != 0) {
            System.out.println("----------------------------------------\n" +"What would you like to do?\n----------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    enterItem(input, purchasedItems);
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

    private static void enterItem(Scanner input, PurchasedItems purchasedItems) {
            input = new Scanner(System.in);
                System.out.println("Enter an item code for purchase.");
//                Scanner inputCode = new Scanner(System.in);
//                String code = inputCode.toString();
                String code=input.nextLine();
                System.out.println("Enter an item for purchase.");
//                String inputItem = input.nextLine();
                String item = input.nextLine();//inputCode.toString();
                System.out.println("Enter a price for purchase. Enter None to quit");
                Scanner inputPrice = new Scanner(System.in);
                String price = input.nextLine();//inputCode.toString();
                StoreItem itemBought = new StoreItem(code, item, price);
                purchasedItems.addItem(itemBought);
                System.out.println("Enter another item? Y/N");
                input = new Scanner(System.in);
        }

    private static void displayOptions() {
        System.out.println("----------------------------------------\n" +"Your options for matrix operations are:\n" +

                "----------------------------------------\n" +

                "\n" +
                "1 – Start New Receipt\n" +
                "2 – Add Items\n" +
                "3 – Display Receipt\n");

    }
}
