import java.util.Date;

public class ReceiptDate {
    private final Object date;

    public ReceiptDate(Object date){
        this.date=date;
    }
    public static ReceiptDate getDate() {
        Date date= new Date();
        ReceiptDate dateObj = new ReceiptDate(date.clone());
        return dateObj;
    }
}
