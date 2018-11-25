import java.util.Date;

public class BasicReceipt implements Receipt {
    private String storeInfo="Best Buy Towson (Store #149)\n" +"1717 York Rd, Timonium, MD 21093\n" +"Phone: (410) 561-2260";  	// store number, store address, phone number
    private String stateCode;  	// MD, DE, CA or MA
    private String lineDecoration="_______________________________________________________";
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
        int i;
        System.out.printf("%-22s%-22s%-22s\n","Item #","Description","Price");
        for(i=0; i<items.size(); i++){
            System.out.println("Test item #"+i+": ");
            System.out.printf("%-22d%-22d%-22d\n",items.getItems().get(i).getItemCode(),items.getItems().get(i).getItemDescription(),items.getItems().get(i).getItemPrice());
        }
        double total = items.getTotalCost();
        double tax=sc.StateComputation(items,date,stateCode);
        System.out.println("Total (Before Tax): "+ total);
        System.out.println("Tax: "+ tax);
        double subtotal = total + tax;
        System.out.println("Total: "+subtotal);
    }

}
