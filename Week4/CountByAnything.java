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
        System.out.print("Enter a number:");
        int userInput = input.nextInt();

        for(count = userInput; count <=(userInput * 100 ); count+=userInput) {
            if (count % (userInput * 10) == 0)
                System.out.println(count);
            else
                System.out.print(count + ", ");
        }
    }
}