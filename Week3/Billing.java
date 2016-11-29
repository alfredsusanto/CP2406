/**
 * Created by jc348287 on 29/11/2016.
 */
public class Billing
{
    private double bookPrice;
    private int quantity;
    private double couponValue;
    public double TAX = 0.08;

    aaaaaaaaaaaaaaaaa(double price, int num, double coupon)
    {
        computeBill(price);
        computeBill(price, num);
        computeBill(price, num, coupon);
    }

    public double computeBill(double bookPrice)
    {
        double totalPrice = bookPrice + (bookPrice* TAX);
        System.out.println(totalPrice);
        return totalPrice;
    }

    public double computeBill(double bookPrice, int quantity)
    {
        double totalPrice = bookPrice * quantity + (bookPrice* TAX);
        System.out.println(totalPrice);
        return totalPrice;
    }

    public double computeBill(double bookPrice, int quantity, double couponValue )
    {
        double totalPrice = bookPrice * quantity + (bookPrice* TAX) - couponValue;
        System.out.println(totalPrice);
        return totalPrice;
    }
}
