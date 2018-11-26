import java.util.ArrayList;
import java.util.Date;

public class ReceiptFactory {
    private static final String StateCode = "MD";
    private static final String date = ReceiptDate.getDate();
    String header ="Best Buy Towson (Store #149)\n" +"1717 York Rd, Timonium, MD 21093\n" +"Phone: (410) 561-2260";  // contains line with “Best Buy”, store_num, street_addr, phone

    private TaxComputation[] taxComputationsObjs;    // tax computation objects (for each state)
    private AddOn[] addOns;   // secondary header, rebate and coupon add-ons
    private StateComputation[] stateComputations;
    private BasicReceipt receipt;
    private ArrayList<StoreItem> storeItems;
    public ReceiptFactory() {  // constructor
        //todo 1. Populates array of StateComputation objects and array of AddOn objects (as if downloaded from the BestBuy web site).
        populateStates();
        populateAddOns();
        // todo 2. Reads config file to assign store_num, street_addr, etc.
        readConfigFile();
        Double tax;
//        ReceiptDate date=ReceiptDate.getDate();
        if (StateCode=="MD"){
            tax= new MDTaxComputation().computeTax(receipt.getItems(), new ReceiptDate(date));
        }
        else if(StateCode=="DE"){
            tax= new MassTaxComputation().computeTax(receipt.getItems(), new ReceiptDate(date));
        }
        else if(StateCode=="CA"){
            tax= new CATaxComputation().computeTax(receipt.getItems(), new ReceiptDate(date));
        }
        else if(StateCode=="MA"){
            tax= new MassTaxComputation().computeTax(receipt.getItems(), new ReceiptDate(date));
        }
        else{

        }
    }

    private void readConfigFile() {
        receipt = new BasicReceipt();
        storeItems = new ArrayList<>();

//        for(int i = 0; i < 10 ; i++){
//            storeItems.add(new StoreItem("00"+i, "placeholder", "10.53"));
//            receipt.addItem(storeItems.get(i));
//        }
//        storeItems.add(new StoreItem("1406", "Rebate Item", "99.98"));
//        receipt.addItem(storeItems.get(0));
        receipt.setTaxComputation(new StateComputation("MD"));
    }

    private void populateAddOns() {
        //
    }

    private void populateStates() {
        stateComputations = new StateComputation[4];

        for(int i = 0; i < stateComputations.length; i++){
            stateComputations[i] = new StateComputation("MD");
        }
    }

    public BasicReceipt getReceipt(ReceiptDate date) {
        receipt.setDate(date);
//        receipt.computation(tax);

        return receipt;
    }
}
