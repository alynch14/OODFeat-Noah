public class MDTaxComputation extends TaxComputation {

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        // todo calls private method taxHoliday as part of this computation
        return 0;
    }

    @Override
    protected boolean taxHoliday() {
        return false;
    }

    private boolean taxHoliday(ReceiptDate date) {
        // todo returns true if date of receipt within the state’s tax free holiday,
        // todo else returns false. Supporting method of method computeTax.
        return false;
    }
    //todo  tax computation objects for other states are similar  (to be completed)
}
