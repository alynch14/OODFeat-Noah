import java.util.Date;

public class GetReceipt {
    private Date date;
    private TaxComputation stateTax;

    public GetReceipt(Date date, TaxComputation tax){
        this.date = date;
        stateTax = tax;
    }
    // todo 1.	Sets the current date of the BasicReceipt.
    public Date getDate(){

    }
    // todo 2.	Attaches the StateComputation object to the BasicReceipt (by call to the setComputation
    // method of BasicReceipt).
    // todo 3.	Traverses over all AddOn objects, calling the applies method of each. If an AddOn object applies, then determines if the AddOn is of type SecondaryHeader, Rebate, or Coupon.
//    If of type SecondaryHeader, then creates a PreDecorator for othe AddOn. If of type Rebate or
//    Coupon, then creates a PostDecorator.
    // todo 4.	Links in the decorator object based on the Decorator design pattern.

    // todo 5.	Adds current date to

    // todo 6.	Returns decorated BasicReceipt object as type Receipt.

}
