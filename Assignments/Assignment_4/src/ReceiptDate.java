import java.util.Date;

public class ReceiptDate {
    public static ReceiptDate getDate() {
        Date date= new Date();
        final ReceiptDate dateObj = (ReceiptDate) date.clone();
        return dateObj;
    }
}
