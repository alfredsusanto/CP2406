/**
 * Created by Fred Sus on 6/12/2016.
 */
public class TestSandwich
{
    public static void main(String[] args)
    {
        Sandwich Nathan = new Sandwich("rye",50 , "egg", 50);
        Sandwich Alfred = new Sandwich("cocoa",100,"salad",150);
        Sandwich Hendry = new Sandwich("powder",150, "ham", 300);
        System.out.println(Nathan.getBread().getBread());
        System.out.println(Nathan.getFilling().getFilling());
        System.out.println(Nathan.getTotalCalories());
        System.out.println(Alfred.getBread().getBread());
        System.out.println(Alfred.getFilling().getFilling());
        System.out.println(Alfred.getTotalCalories());
        System.out.println(Hendry.getBread().getBread());
        System.out.println(Hendry.getFilling().getFilling());
        System.out.println(Hendry.getTotalCalories());

    }
}
