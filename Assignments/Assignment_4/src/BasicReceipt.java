import java.util.Date;

public class BasicReceipt implements Receipt {
    private String storeInfo="Best Buy Towson (Store #149)\n" +"1717 York Rd, Timonium, MD 21093\n" +"Phone: (410) 561-2260";  	// store number, store address, phone number
    private String stateCode;  	// MD, DE, CA or MA
    private String lineDecoration="________________________________________";
    private PurchasedItems items;
    private ReceiptDate date= (ReceiptDate) ReceiptDate.getDate();
    private TaxComputation tc;
    private StateComputation sc= new StateComputation();
    public BasicReceipt(){
        items = new PurchasedItems();
    }

    public BasicReceipt(PurchasedItems items) {
        this.items = items;
    }

    public void setTaxComputation(TaxComputation tc) { this.tc = tc; }

    public void setDate(ReceiptDate date) {
        this.date = date;
    }

    public void prtReceipt() {
        System.out.println(lineDecoration);
        System.out.println(storeInfo);
        System.out.println(lineDecoration);
        System.out.println("Date: "+ date);
        System.out.println(items);
        System.out.println("Total (Before Tax): "+items.getTotalCost());
//        System.out.println("Tax: "+tc.computeTax(items, date));
        System.out.println("Tax: "+ sc.StateComputation(items,date,stateCode));
        System.out.println("Total: "+2);
    }

}
