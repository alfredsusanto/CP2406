/**
 * Created by Fred Sus on 5/12/2016.
 */
public class Billing
{
    double tax;
    double total;
    double totalDue;
    double coupon;

    public void computeBill(double price)
    {
        tax = price * 0.08;
        totalDue = price + tax;
    }

    public void computeBill(double price, double quantity)
    {
        tax = price * 0.08;
        total = price * quantity;
        totalDue = tax + total;
    }

    public void computeBill(double price, double quantity, double couponvalue)
    {
        tax = price * 0.08;
        total = price * quantity;
        coupon = total - couponvalue;
        totalDue = tax + coupon;
    }

    public double totalDue()
    {
        return totalDue;
    }
}

