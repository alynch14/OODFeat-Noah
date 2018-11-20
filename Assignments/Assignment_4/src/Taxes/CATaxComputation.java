package Assignments.Assignment_4.src.Taxes;

public class CATaxComputation extends Assignments.Assignment_4.src.Taxes.TaxComputation {

    public double computeTax(PurchasedItems items, Assignments.Assignment_4.src.ReceiptClasses.ReceiptDate date) {
        if((Boolean) taxHoliday(date)){
            return 0;
        }
        else{
            double tax = 0.075 * items.getTotalCost();
            return tax;
        }
    }

    protected boolean taxHoliday(Assignments.Assignment_4.src.ReceiptClasses.ReceiptDate date) {
        return false;
    }
}

