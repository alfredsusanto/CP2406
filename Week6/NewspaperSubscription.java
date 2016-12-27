/**
 * Created by Fred Sus on 26/12/2016.
 */
public abstract class NewspaperSubscription {
    private String name;
    protected String address;
    protected double rate;

    NewspaperSubscription(String nam, String addres)
    {
        name = nam;
        address = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String nam) {
        name = nam;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress();
}