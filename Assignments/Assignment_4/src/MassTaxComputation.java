public class MassTaxComputation  extends TaxComputation {
    @Override
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if((Boolean) taxHoliday(date)){
            return 0;
        }
        else{
            double tax = 0.0625 * items.getTotalCost();
            return tax;
        }
    }

    protected boolean taxHoliday(ReceiptDate date) {
        return date.equals("08/13") || date.equals("08/14");
    }
}