/**
 * Created by Fred Sus on 26/12/2016.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    OnlineNewspaperSubscription(String nam, String addres)
    {
        super(nam,addres);
        setAddress();
    }

    public void setAddress()
    {
        if(getAddress().contains("@"))
        {
            rate = 9;
        }
        else
        {
            System.out.println("Invalid Address");
        }
    }
}
