/**
 * Created by jc348287 on 12/12/2016.
 */
public class TwelveInts {
    public static void main(String[] args)
    {
        int twelveNumbers[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        for( int a : twelveNumbers)
        {
            System.out.print(a + " ");
        }

        System.out.println();

        for(int b = twelveNumbers.length-1; b>=0; b--)
        {
            System.out.print(twelveNumbers[b]+" ");
        }
    }
}
