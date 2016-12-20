/**
 * Created by jc348287 on 13/12/2016.
 */
import java.lang.*;
public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold demo = new ItemSold(1, "Black Dog", 1000);
        System.out.println(demo.getNumber());
        System.out.println(demo.getDescription());
        System.out.println(demo.getPrice());

        PetSold demo2 = new PetSold(demo.getNumber(), demo.getDescription(), demo.getPrice(), false, false, true);
        System.out.println(demo2.getNumber());
        System.out.println(demo2.getDescription());
        System.out.println(demo2.getPrice());
        System.out.println(demo2.getVaccinated());
        System.out.println(demo2.getNeutered());
        System.out.println(demo2.getHousebroken());
        demo2.setVaccinated(true);
        System.out.println(demo2.getVaccinated());
        demo2.setNeutered(true);
        System.out.println(demo2.getNeutered());
    }
}