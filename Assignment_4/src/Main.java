public class Main {

    public static void main(String[] args) {
        // 1.	Creates a PurchasedItems object.
        // 2.	Constructs ReceiptFactory object.
        // 3.	Prompts user for items to purchase, storing each in PurchasedItems.
        // 4.	Calls the getReceipt method of the factory to obtain constructed receipt.
        // 5.	Prints receipt by method call to constructed receipt.

        // get receipt date
        // (prompt user for current date)

        // display all available products to user
//        (to be implemented)

        // get all user selections
//        (to be implemented)

        ReceiptFactory factory = new ReceiptFactory();
        Receipt receipt = factory.getReceipt(items, date);
        receipt.prtReceipt();


    }
}
