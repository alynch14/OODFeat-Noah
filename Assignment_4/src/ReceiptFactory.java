public class ReceiptFactory {
    String header;  // contains line with “Best Buy”, store_num, street_addr, phone
    String state_code;

    private TaxComputation[] taxComputationsObjs;    // tax computation objects (for each state)
    private AddOn[] addOns;   // secondary header, rebate and coupon add-ons

    public ReceiptFactory() {  // constructor
        // 1. Populates array of StateComputation objects and array of AddOn objects (as if downloaded
//        from the BestBuy web site).
        // 2. Reads config file to assign store_num, street_addr, etc.
        // 3.	Based on the state code (e.g., “MD”, from the config file) stores appropriate
//        StateComputation object to be used on all receipts.

    }
