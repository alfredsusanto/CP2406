/**
 * Created by jc348287 on 27/11/2016.
 */
import javax.swing.JOptionPane;
public class Eggs {
    public static void main(String[] args)
    {
        String input;
        int eggs;
        input = JOptionPane.showInputDialog(null,"Enter the number of eggs you want to buy");
        eggs = Integer.parseInt(input);
        int eggsInDozen = dozenOfEggs(eggs);
        int remainedEggs = eggsLeft(eggs);
        JOptionPane.showMessageDialog(null,"You ordered " + eggs + " eggs. That's " + eggsInDozen + " dozen at $3.25 per dozen and " + remainedEggs + " loose eggs at 45 cents each for a total of $" + (eggsInDozen*3.25+remainedEggs*0.45));
    }

    public static int dozenOfEggs(int numberOfEggs)
    {
        int dozen = numberOfEggs/12;
        return dozen;
    }

    public static int eggsLeft(int numberOfEggs)
    {
        int leftEggs = numberOfEggs%12;
        return leftEggs;
    }
}
