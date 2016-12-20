/**
 * Created by jc348287 on 13/12/2016.
 */
public class PetSold extends ItemSold
{
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    PetSold(int num, String desc, double prc, boolean vac, boolean neu, boolean hou)
    {
        super(num, desc, prc);
        vaccinated = vac;
        neutered = neu;
        housebroken = hou;
    }

    public boolean getVaccinated()
    {
        return vaccinated;
    }

    public boolean getNeutered()
    {
        return neutered;
    }

    public boolean getHousebroken()
    {
        return housebroken;
    }

    public void setVaccinated(boolean vac)
    {
        vaccinated = vac;
    }

    public void setNeutered(boolean neu)
    {
        neutered = neu;
    }

    public void setHousebroken(boolean hou)
    {
        housebroken = hou;
    }
}
