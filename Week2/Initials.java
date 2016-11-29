/**
 * Created by jc348287 on 22/11/2016.
 */
import javax.swing.*;
public class Initials
{
    String name;
    public String getName(String a)
    {
        name = a;
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void displayInitials()
    {
        String[] initials = name.split(" ");
        char first = initials[0].charAt(0);
        char second = initials[1].charAt(0);
        char third = initials[2].charAt(0);
        System.out.println(first + "," + second + "," + third);
    }
}
