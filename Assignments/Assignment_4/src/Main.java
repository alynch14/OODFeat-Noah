public class Main {

    public static void main(String[] args) {
        Object items = null;
        String date = ReceiptDate.getDate().toString();
        PurchasedItems purchasedItems = new PurchasedItems();
        ReceiptFactory factory = new ReceiptFactory();
        // todo 3.	Prompts user for items to purchase, storing each in PurchasedItems.

        while (input!="Done"){
            System.out.println("Enter an item for purchase");
        }
        // todo 4.	Calls the getReceipt method of the factory to obtain constructed receipt.
        // todo 5.	Prints receipt by method call to constructed receipt.

        // todo get receipt date(prompt user for current date)

        // todo display all available products to user(to be implemented)

        // todo get all user selections(to be implemented)

//        while(input!=null){add items to the reciept }
        Receipt receipt = factory.getReceipt(items, date);
        receipt.prtReceipt();

    }
}
