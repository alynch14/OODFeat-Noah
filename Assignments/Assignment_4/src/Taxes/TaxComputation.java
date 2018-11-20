package Assignments.Assignment_4.src.Taxes;

public abstract class TaxComputation {
    public abstract double computeTax(PurchasedItems items, ReceiptDate date);
    protected abstract boolean taxHoliday(ReceiptDate date);
}
