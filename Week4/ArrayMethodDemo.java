/**
 * Created by jc348287 on 12/12/2016.
 */
import java.util.*;
public class ArrayMethodDemo {
    public static void main(String[] args)
    {
        int tenNumbers[] = {11,2,3,4,5,6,7,8,9,12};
        displayAll(tenNumbers);
        displayReverse(tenNumbers);
        displaySum(tenNumbers);
        displayLessThanLimitingNumber(tenNumbers);
        displayHigherThanAverage(tenNumbers);
    }

    public static void displayAll(int array[])
    {
        for(int a : array)
        {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void displayReverse(int array[])
    {
        for(int b = array.length-1; b>=0; b--)
        {
            System.out.print(array[b] + " ");
        }
        System.out.println();
    }

    public static void displaySum(int array[])
    {
        int sum = 0;
        for(int c : array)
        {
            sum += c;
        }
        System.out.print(sum);
        System.out.println();
    }

    public static void displayLessThanLimitingNumber(int array[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a limiting number: ");
        int userInput = input.nextInt();

        for(int d: array)
        {
            if(d < userInput)
                System.out.print(d + " ");
        }
        System.out.println();
    }
    public static void displayHigherThanAverage(int array[])
    {
        int sum = 0;
        for(int e : array)
        {
            sum += e;
        }

        int average = sum/array.length;

        for(int f : array)
        {
            if(f > average)
            {
                System.out.print(f + " ");
            }
        }
    }
}
