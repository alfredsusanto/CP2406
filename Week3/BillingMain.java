/**
 * Created by Fred Sus on 5/12/2016.
 */
public class BillingMain
{
    public static void main (String[] args)
    {
        Billing billing = new Billing();
        billing.computeBill(50);
        System.out.println(billing.totalDue());
        billing.computeBill(50,5);
        System.out.println(billing.totalDue());
        billing.computeBill(50,5,10);
        System.out.println(billing.totalDue());
    }
}
