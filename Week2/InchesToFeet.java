/**
 * Created by jc348287 on 22/11/2016.
 */
public class InchesToFeet
{
    public static void main(String[] args)
    {
        int inches = 86;
        int feet = inches / 12;
        int leftover = inches % 12;
        System.out.println(feet + " feet and " + leftover + " inches");
    }
}
