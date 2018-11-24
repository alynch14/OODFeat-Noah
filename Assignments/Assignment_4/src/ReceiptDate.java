import java.util.Date;

public class ReceiptDate {
    private static Object date;
    public ReceiptDate(Date dateObject) {
        date = dateObject;
    }

    public ReceiptDate(String dateString){
        date = dateString;
    }

    public static Object getDate() {
        return date;
    }

    public boolean equals(Object obj){
        String myDate = " ";
        if(obj.getClass().equals(String.class)){
            myDate = (String) obj;
        }
        else if(obj.getClass().equals(Date.class)){
            myDate = ((Date) obj).toString();
        }
        return myDate.equals(date);
    }
}
