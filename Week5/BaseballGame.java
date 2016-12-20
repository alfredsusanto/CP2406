/**
 * Created by Fred Sus on 19/12/2016.
 */
public class BaseballGame {
    private String firstTeamName;
    private String secondTeamName;
    private int[] firstTeamScore;
    private int[] secondTeamScore;

    public BaseballGame(String team1Name, String team2Name)
    {
        firstTeamName = team1Name;
        secondTeamName = team2Name;

        firstTeamScore = new int[9];
        for (int i = 0; i <firstTeamScore.length;i++)
        {
            firstTeamScore[i]= -1;
        }

        secondTeamScore = new int[9];
        for (int i = 0; i <secondTeamScore.length;i++)
        {
            secondTeamScore[i]= -1;
        }
    }

    public String getTeam1Name()
    {
        return firstTeamName;
    }

    public void setTeam1Name(String team1Name)
    {
        firstTeamName = team1Name;
    }

    public String getTeam2Name()
    {
        return secondTeamName;
    }

    public void setTeam2Name(String team2Name)
    {
        secondTeamName = team2Name;
    }

    public int countInning(int[] teamscore)
    {
        int count = 0;
        for(int i = 0; i<teamscore.length; i++)
        {
            if (teamscore[i] != -1)
            {
                count++;
            }
        }
        return count;
    }

    public int getTeam1Score(int inning)
    {
        return firstTeamScore[inning];
    }

    public void setTeam1Score(int inning, int score) {
        if(inning<countInning(firstTeamScore))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>firstTeamScore.length)
        {
            System.out.println("Game is already over");
        }
        else
        if(inning>countInning(firstTeamScore))
        {
            System.out.println("Have not reach that inning");
        }
        else
        {firstTeamScore[inning] = score ;}
    }

    public int getTeam2Score(int inning) {
        return secondTeamScore[inning];
    }

    public void setTeam2Score(int inning, int score) {
        if(inning<countInning(secondTeamScore))
        {
            System.out.println("Cannot change inning score");
        }
        else
        if(inning>secondTeamScore.length)
        {
            System.out.println("Game is already over");
        }
        else
        if(inning>countInning(secondTeamScore))
        {
            System.out.println("Have not reach that inning");
        }
        else
        {secondTeamScore[inning] = score ;}
    }

    public void add(String teamname, int score)
    {
        if(teamname.equals(firstTeamName))
        {
            setTeam1Score(countInning(firstTeamScore), score);
        }
        else
        {
            setTeam2Score(countInning(secondTeamScore), score);
        }

    }
}
