public class CATaxComputation extends TaxComputation {

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if((Boolean) taxHoliday(date)){
            return 0;
        }
        else{
            double tax = 0.075 * items.getTotalCost();
            return tax;
        }
    }

    protected boolean taxHoliday(ReceiptDate date) {
        return false;
    }
}
