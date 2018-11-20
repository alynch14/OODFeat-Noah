public class ReceiptDate {
    private final Object date;
    public ReceiptDate(Object date){
        this.date=date;
    }
    public static ReceiptDate getDate() {
        String month="November";
        String day="20";
        String year="2018";
        String full= month+" "+day+", "+year;
        ReceiptDate dateObj = new ReceiptDate(full);
        System.out.println("full: "+full);
        System.out.println("Dateobj: "+dateObj.toString());
        return dateObj;
    }
}
