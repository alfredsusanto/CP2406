/**
 * Created by jc348287 on 13/12/2016.
 */
public class ItemSold
{
    private int number;
    private String description;
    private double price;

    ItemSold(int num, String desc, double prc)
    {
        number =  num;
        description = desc;
        price = prc;
    }

    public int getNumber()
    {
        return number;
    }

    public String getDescription()
    {
        return description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setNumber(int num)
    {
        number = num;
    }

    public void setDescription(String desc)
    {
        description = desc;
    }

    public void setPrice(double prc)
    {
        price = prc;
    }
}
