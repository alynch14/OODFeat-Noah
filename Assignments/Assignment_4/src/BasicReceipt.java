import java.util.Date;

public class BasicReceipt implements Receipt {
    private String storeInfo;  	// store number, store address, phone number
    private String stateCode;  	// MD, DE, CA or MA

    private PurchasedItems items;
    private ReceiptDate date=ReceiptDate.getDate();
    private TaxComputation tc;

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
        System.out.println("Date: "+ date.toString());
        System.out.println(items);    }
}
