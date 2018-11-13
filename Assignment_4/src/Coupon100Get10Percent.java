public class Coupon100Get10Percent implements AddOn, Coupon {
    @Override
    public boolean applies(PurchasedItems items) {
        return false;
    }

    @Override
    public String getLines() {
        return null;
    }
    // similar to rebate class
}
