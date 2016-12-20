/**
 * Created by jc348287 on 20/12/2016.
 */
public abstract class Book
{
    private String title;
    public double price;

    public Book(String titl)
    {
        title = titl;
    }

    public String getTitle()
    {
        return title;
    }

    public double getPrice()
    {
        return price;
    }

    public abstract void setPrice();
}
