import java.util.Date;

public class ReceiptFactory {
    private static final String StateCode = "MD";
    private static final ReceiptDate date = (ReceiptDate) ReceiptDate.getDate();
    String header ="Best Buy Towson (Store #149)\n" +"1717 York Rd, Timonium, MD 21093\n" +"Phone: (410) 561-2260";  // contains line with “Best Buy”, store_num, street_addr, phone

    private TaxComputation[] taxComputationsObjs;    // tax computation objects (for each state)
    private AddOn[] addOns;   // secondary header, rebate and coupon add-ons
    private StateComputation[] stateComputations;
    public ReceiptFactory() {  // constructor
        //todo 1. Populates array of StateComputation objects and array of AddOn objects (as if downloaded from the BestBuy web site).
        populateStates();
        populateAddOns();
        // todo 2. Reads config file to assign store_num, street_addr, etc.
        readConfigFile();
        Double tax;
        PurchasedItems items=null;
//        ReceiptDate date=ReceiptDate.getDate();

    }

    private void readConfigFile() {
        //
    }

    private void populateAddOns() {
        //
    }

    private void populateStates() {
        //
    }

    public Receipt getReceipt(PurchasedItems items, ReceiptDate date) {
        BasicReceipt receipt = new BasicReceipt(items);
        receipt.setDate(date);
//        receipt.computation(tax);

        return receipt;
    }
}
