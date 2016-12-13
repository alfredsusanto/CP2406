/**
 * Created by jc348287 on 13/12/2016.
 */
import java.lang.*;
public class DemoHorses
{
    public static void main(String[] args)
    {
        Horse demo = new Horse("Alfred", "White", 2005);
        System.out.println(demo.getName());
        System.out.println(demo.getColor());
        System.out.println(demo.getbirthYear());

        RaceHorse demo2 = new RaceHorse("Charlie", "Black", 2008, 10);
        System.out.println(demo2.getName());
        System.out.println(demo2.getColor());
        System.out.println(demo2.getbirthYear());
        System.out.println(demo2.getNumberOfRace());
    }
}
