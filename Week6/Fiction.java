/**
 * Created by jc348287 on 20/12/2016.
 */

public class Fiction extends Book
{
    public Fiction(String titl)
    {
        super(titl);
        setPrice();
    }

    public void setPrice()
    {
        price = 24.99;
    }
}
