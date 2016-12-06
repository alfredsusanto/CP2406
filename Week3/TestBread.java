/**
 * Created by Fred Sus on 6/12/2016.
 */
public class TestBread
{
    public static void main(String[] args)
    {
        Bread Chocolate = new Bread("rye",50);
        Bread Chocolate2 = new Bread("cocoa",100);
        Bread Milk = new Bread("powder",150);
        System.out.println(Chocolate.getBread());
        System.out.println(Chocolate.getCalories());
        System.out.println(Chocolate.getMOTTO());
        System.out.println(Chocolate2.getBread());
        System.out.println(Chocolate2.getCalories());
        System.out.println(Chocolate2.getMOTTO());
        System.out.println(Milk.getBread());
        System.out.println(Milk.getCalories());
        System.out.println(Milk.getMOTTO());
    }
}
