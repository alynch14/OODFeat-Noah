package Taxes;

public class CATaxComputation extends TaxComputation {

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        // todo calls private method taxHoliday as part of this computation
        return 0;
    }

    protected boolean taxHoliday(ReceiptDate date) {
        // todo returns true if date of receipt within the state’s tax free holiday,
        // todo else returns false. Supporting method of method computeTax.


        return false;
    }
    //todo  tax computation objects for other states are similar  (to be completed)
}
