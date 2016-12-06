/**
 * Created by Fred Sus on 6/12/2016.
 */
public class TestSandwichFilling
{
    public static void main(String[] args)
    {
        SandwichFilling NathanSandwich = new SandwichFilling("Egg",50);
        SandwichFilling HendrySandwich = new SandwichFilling("Salad",100);
        SandwichFilling AlfredSandwich = new SandwichFilling("Ham",300);
        System.out.println(NathanSandwich.getFilling());
        System.out.println(NathanSandwich.getCalories());
        System.out.println(AlfredSandwich.getFilling());
        System.out.println(AlfredSandwich.getCalories());
        System.out.println(HendrySandwich.getFilling());
        System.out.println(HendrySandwich.getCalories());

    }
}
