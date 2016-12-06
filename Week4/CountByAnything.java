/**
 * Created by jc348287 on 6/12/2016.
 */
import java.util.*;
public class CountByAnything
{
    public static void main (String[] args)
    {
        int count;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int UserInput = input.nextInt();

        for(count = UserInput; count<=( ); ++count)
            if (count*10 == 0)
                System.out.println(count);
            else
                System.out.println(count + ", ");
    }
}
