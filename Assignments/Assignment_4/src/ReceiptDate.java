import java.util.Date;

public class ReceiptDate {
    private static ReceiptDate date;
    public ReceiptDate(ReceiptDate dateObject) {
        date = dateObject;
    }

    public ReceiptDate(String dateString){
        date = ReceiptDate dateString.;
    }

    public static ReceiptDate getDate() {
        System.out.println("ReceiptDate: "+date.toString());
        return (ReceiptDate) date;
    }

    public boolean equals(Object obj){
        String myDate = " ";
        if(obj.getClass().equals(String.class)){
            myDate = (String) obj;
        }
        else if(obj.getClass().equals(Date.class)){
            myDate = ((Date) obj).toString();
        }
        System.out.println("MyDate: "+myDate);
        return myDate.equals(date);
    }
}
