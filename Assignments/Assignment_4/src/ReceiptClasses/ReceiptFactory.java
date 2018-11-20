package Assignments.Assignment_4.src.ReceiptClasses;

public class ReceiptFactory {
    private static final String StateCode = null;
    String header;  // contains line with “Best Buy”, store_num, street_addr, phone
    String state_code;

    private TaxComputation[] taxComputationsObjs;    // tax computation objects (for each state)
    private AddOn[] addOns;   // secondary header, rebate and coupon add-ons

    public ReceiptFactory() {  // constructor
        //todo 1. Populates array of StateComputation objects and array of AddOn objects (as if downloaded from the BestBuy web site).
        // todo 2. Reads config file to assign store_num, street_addr, etc.
        // todo 3.	Based on the state code (e.g., “MD”, from the config file) stores appropriate StateComputation object to be used on all receipts.
        Object tax;
        if (StateCode=="MD"){
                tax=MDTaxComputation(items, date);
            }
            else if(StateCode=="DE"){
                tax=MassTaxComputation(items, date);
            }
            else if(StateCode=="CA"){
                tax=CATaxComputation(items, date);
            }
            else if(StateCode=="MA"){
                tax=MassTaxComputation(items, date);
            }
            else{

            }
    }

    public Receipt getReceipt(PurchasedItems items) {
        BasicReceipt receipt = new BasicReceipt();
        receipt.setDate(ReceptDate.getDate());
        receipt.setComputation(tax);
        
        return null;
    }
}
