/**
 * Created by jc348287 on 29/11/2016.
 */
public class Billing
{
    private double bookPrice;
    private int quantity;
    private double couponValue;
    public double TAX = 0.08;

    public static void main()
    {

    }

    public double computeBill(double bookPrice)
    {

        double totalPrice = bookPrice + (bookPrice* TAX);
        return totalPrice;
    }

    public double computeBill(double bookPrice, int quantity)
    {
        double totalPrice = bookPrice * quantity + (bookPrice* TAX);
        return totalPrice;
    }

    public double computeBill(double bookPrice, int quantity, double couponValue )
    {
        double totalPrice = bookPrice * quantity + (bookPrice* TAX) - couponValue;
        return totalPrice;
    }
}
