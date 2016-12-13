/**
 * Created by jc348287 on 13/12/2016.
 */
public class RaceHorse extends Horse
{
    private int numberOfRace;

    RaceHorse(String nam, String colo, int birth, int number)
    {
        super(nam,colo, birth);
                numberOfRace = number;
    }

    public int getNumberOfRace()
    {
        return numberOfRace;
    }

    public void setNumberOfRace(int number)
    {
        numberOfRace = number;
    }
}
