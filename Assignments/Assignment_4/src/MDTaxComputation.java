
public class MDTaxComputation extends TaxComputation {

    public double computeTax(PurchasedItems items, ReceiptDate date) {
        if((Boolean) taxHoliday(date)){
            return 0;
        }
        else{
            double tax = 0.06 * items.getTotalCost();
            return tax;
        }
    }

    protected boolean taxHoliday(ReceiptDate date) {
        if (date.equals("08/12") || date.equals("08/13") || date.equals("08/14") || date.equals("08/15") || date.equals("08/16") || date.equals("08/17") || date.equals("08/18")){
            return true;
        }
        else {
            return false;
        }
    }
}
