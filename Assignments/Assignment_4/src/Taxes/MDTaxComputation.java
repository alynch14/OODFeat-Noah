package Taxes;

public class MDTaxComputation extends TaxComputation {

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        // todo calls private method taxHoliday as part of this computation
        return 0;
    }

//    @Override
//    protected boolean taxHoliday() {
//        return false;
//    }

    protected boolean taxHoliday(ReceiptDate date) {
        // todo returns true if date of receipt within the state’s tax free holiday,
        if (date.equals(true)){ //todo change placeholder with actual dates
            return true;
        }
        else {
            return false;
        }
    }
    //todo  tax computation objects for other states are similar  (to be completed)
}
