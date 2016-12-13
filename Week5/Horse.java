/**
 * Created by jc348287 on 13/12/2016.
 */
public class Horse
{
    private String name;
    private String color;
    private int birthYear;

    Horse(String nam, String colo, int birth)
    {
        name =  nam;
        color = colo;
        birthYear = birth;
    }

    public String getName()
    {
        return name;
    }

    public String getColor()
    {
        return color;
    }

    public int getbirthYear()
    {
        return birthYear;
    }

    public void setName(String nam)
    {
        name = nam;
    }

    public void setColor(String colo)
    {
        color = colo;
    }

    public void setBirthYear(int birth)
    {
        birthYear = birth;
    }
}
