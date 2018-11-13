public class MassTaxComputation  extends TaxComputation {
    @Override
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        return 0;
    }

    protected boolean taxHoliday(ReceiptDate date) {
        // todo returns true if date of receipt within the state’s tax free holiday,
        // todo else returns false. Supporting method of method computeTax.
        return false;
    }
}
