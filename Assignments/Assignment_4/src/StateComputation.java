public class StateComputation extends TaxComputation{
    double tax=0;
    private String stateCode;

    public StateComputation(String code){
        stateCode = code;
    }

    public Double StateComputation(PurchasedItems items, ReceiptDate date) {
        if (stateCode.equals("MD")) {
            return tax = new MDTaxComputation().computeTax(items, date);
        } else if (stateCode.equals("DE")) {
            return tax = (int) new MassTaxComputation().computeTax(items, date);
        } else if (stateCode.equals("CA")) {
            return tax = (int) new CATaxComputation().computeTax(items, date);
        } else if (stateCode.equals("MA")) {
            return tax = (int) new MassTaxComputation().computeTax(items, date);
        } else {
            return tax = 0.6 * 2;//todo add total
        }
    }

    @Override
    public double computeTax(PurchasedItems items, ReceiptDate date) {
        return 0;
    }

    @Override
    protected boolean taxHoliday(ReceiptDate date) {
        return false;
    }
}
