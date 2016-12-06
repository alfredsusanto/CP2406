/**
 * Created by jc348287 on 6/12/2016.
 */
public class CountByThree
{
    public static void main (String[] args)
    {
        int count;
        for(count = 3; count <=300; ++count)
        {
            if (count % 30 == 0)
                System.out.println(count);
            else
                System.out.println(count + " ");
        }
    }
}
