import java.util.Date;

public class ReceiptFactory {
    private static final String StateCode = null;
    private static final ReceiptDate date = ReceiptDate.getDate();
    String header;  // contains line with “Best Buy”, store_num, street_addr, phone
    String state_code;

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
        if (StateCode=="MD"){
                tax= new MDTaxComputation().computeTax(items, date);
            }
            else if(StateCode=="DE"){
                tax= new MassTaxComputation().computeTax(items, date);
            }
            else if(StateCode=="CA"){
                tax= new CATaxComputation().computeTax(items, date);
            }
            else if(StateCode=="MA"){
                tax= new MassTaxComputation().computeTax(items, date);
            }
            else{

            }
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
        BasicReceipt receipt = new BasicReceipt();
        receipt.setDate(date);
//        receipt.computation(tax);

        return receipt;
    }
}
