public class PreDecorator extends Decorator {
    private AddOn a;

    public PreDecorator(AddOn a, Receipt r) {
        super(r);
        this.a = a;
    }

    public void prtReceipt() {
        PurchasedItems items= new PurchasedItems();
        System.out.println(a.applies(items));
        callTrailer();
    }
}
