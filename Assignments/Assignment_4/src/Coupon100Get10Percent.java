public class Coupon100Get10Percent implements AddOn, Coupon {
    @Override
    public boolean applies(PurchasedItems items) {
        return false;
    }

    @Override
    public String getLines() {
        return "- - - - - - - - - - - - COUPON - - - - - - - - - - - - \n"
                +String.format("%-22s%-22s%-22s\n","","TEXT 10FOR100","")
                +String.format("%-22s%-22s%-22s\n","","TO 332211","")
                +String.format("%-22s%-22s%-22s\n","","FOR 10% OFF","")
                +String.format("%-22s%-22s%-22s\n","","YOUR NEXT PURCHASE","")
                +"- - - - - - - - - - - - COUPON - - - - - - - - - - - - \n";
    }
    // similar to rebate class
}
