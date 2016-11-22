/**
 * Created by jc348287 on 22/11/2016.
 */
import javax.swing.*;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        String input;
        input = JOptionPane.showInputDialog("Enter inches value");

        int newInches  = Integer.parseInt(input);

        int feet = newInches / 12;
        int leftover = newInches % 12;
        System.out.println(feet + " feet and " + leftover + " inches");
    }

}