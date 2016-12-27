/**
 * Created by jc348287 on 20/12/2016.
 */
public class NonFiction extends Book
{
    public NonFiction(String titl)
    {
        super(titl);
        setPrice();
    }

    public void setPrice()
    {
        price = 37.99;
    }
}
