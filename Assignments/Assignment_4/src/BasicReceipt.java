import java.text.NumberFormat;

public class BasicReceipt implements Receipt {
    NumberFormat nf = NumberFormat.getInstance();
    private String storeInfo="Best Buy Towson (Store #149)\n" +"1717 York Rd, Timonium, MD 21093\n" +"Phone: (410) 561-2260";  	// store number, store address, phone number
    private String stateCode;  	// MD, DE, CA or MA
    private String lineDecoration="_______________________________________________________";
    private PurchasedItems items;
    private String date= ReceiptDate.getDate();
    private StateComputation tc;
//    private StateComputation sc= new StateComputation();

    public BasicReceipt(){
        items = new PurchasedItems();
    }

    public BasicReceipt(PurchasedItems items) {
        this.items = items;
    }

    public void addItem(StoreItem item){
        items.addItem(item);
    }

    public void setTaxComputation(StateComputation tc) { this.tc = tc; }

    public void setDate(ReceiptDate date) {
        this.date = date.toString();
    }

    public void prtReceipt() {
        System.out.println(lineDecoration);
        System.out.println(storeInfo);
        if(date.contains("11/") || date.contains("12/")){
            System.out.print(new HolidayGreeting().getLines());
        }
        System.out.println(lineDecoration);
        System.out.println("Date: "+ date);
        int i;
        System.out.printf("%-22s%-22s%-22s\n","Item #","Description","Price");
        for(i=0; i<items.size(); i++){
            System.out.printf("%-22s%-22s%-22s\n",items.getItems().get(i).getItemCode(),items.getItems().get(i).getItemDescription(),items.getItems().get(i).getItemPrice());
        }
        double total = items.getTotalCost();
        double tax=tc.StateComputation(items,new ReceiptDate(date));
        System.out.println(lineDecoration);
        System.out.println("Total (Before Tax): "+ total);
        System.out.println("Tax: "+ nf.format(tax));
        double subtotal = total + tax;
        System.out.println("Total: "+nf.format(subtotal));
        System.out.println(lineDecoration);
        if(total>100){
            System.out.print(new Coupon100Get10Percent().getLines());
        }
        if(items.containsItem("1406")){
            System.out.print(new Rebate1406().getLines());
        }
        System.out.println(lineDecoration);
    }

    public PurchasedItems getItems(){
        return items;
    }

}
