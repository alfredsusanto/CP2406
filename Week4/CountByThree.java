/**
 * Created by jc348287 on 6/12/2016.
 */
public class CountByThree
{
    public static void main (String[] args)
    {
        int count;
        for(count = 3; count <= (3*100); count+=3)
        {
            if (count % (3*10) == 0)
                System.out.println(count);
            else
                System.out.print(count + ", ");
        }
    }
}