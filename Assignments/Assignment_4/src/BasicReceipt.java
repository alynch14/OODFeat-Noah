import java.util.Date;

public class BasicReceipt implements Receipt {
    private String storeInfo;  	// store number, store address, phone number
    private String stateCode;  	// MD, DE, CA or MA

    private PurchasedItems items;
    private ReceiptDate date= (ReceiptDate) ReceiptDate.getDate();
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
        //todo store header
        System.out.println("Date obj: "+date);
        System.out.println("Date: "+ date.toString());
        System.out.println(items);    }
        //todo itemized sales
        //todo Total Sale (without sales tax)
        //todo	Amount Due (with added sales tax)
}
