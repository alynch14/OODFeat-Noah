public class Rebate1406 implements AddOn, Rebate {

    public boolean applies(PurchasedItems items) {
        return items.containsItem("1406");
        }

    @Override
    public String getLines() {
        return "- - - - - - - - - - - - REBATE - - - - - - - - - - - - \n"
                +"Mail-in Rebate for Item #1406\n"
                + "Name:\n"
                + "Address:\n\n"
                + "Mail to:\n"+" Best Buy Rebates,\n"+" P.O. Box 1400,\n"+" Orlando, FL\n"
                +"- - - - - - - - - - - - REBATE - - - - - - - - - - - - \n";
    }
}