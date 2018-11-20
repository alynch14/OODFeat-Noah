import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {
        String code=null;
        String item=null;
        String price=null;
        PurchasedItems items = null;
        ReceiptDate date = ReceiptDate.getDate();
        PurchasedItems purchasedItems = new PurchasedItems();
        ReceiptFactory factory = new ReceiptFactory();
        System.out.println("Enter an item? Y/N");
        input = new Scanner(System.in);
        while (!input.equals("N")){
            System.out.println("Enter an item code for purchase. Enter None to quit");
            Scanner inputCode = new Scanner(System.in);
            code=inputCode.toString();
            System.out.println("Enter an item for purchase. Enter None to quit");
            Scanner inputItem = new Scanner(System.in);
            item=inputCode.toString();
            System.out.println("Enter a price for purchase. Enter None to quit");
            Scanner inputPrice = new Scanner(System.in);
            price=inputCode.toString();
            StoreItem itemBought = new StoreItem(code, item, price);
            purchasedItems.addItem(itemBought);
            System.out.println("Enter another item? Y/N");
            input = new Scanner(System.in);
        }

        // todo display all available products to user(to be implemented)

        // todo get all user selections(to be implemented)

//        while(input!=null){add items to the reciept }
        Receipt receipt = (Receipt) factory.getReceipt(items, date);
        receipt.prtReceipt();

    }
}
