/**
 * Created by Fred Sus on 26/12/2016.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    PhysicalNewspaperSubscription(String nam, String addres)
    {
        super(nam,addres);
        setAddress();
    }

    public void setAddress()
    {
        if(getAddress().matches(".*\\d.*"))
        {
            rate = 15;
        }
        else
        {
            System.out.println("Invalid Address");
            rate = 0;
        }
    }
}
