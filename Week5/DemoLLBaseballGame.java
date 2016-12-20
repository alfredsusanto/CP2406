/**
 * Created by Fred Sus on 19/12/2016.
 */
public class DemoLLBaseballGame {
    public static void main(String[] args)
    {
        LittleLeagueBaseballGame game = new LittleLeagueBaseballGame("Chelsea", "Juventus");
        game.setTeam1Score(0, 20);
        game.setTeam2Score(2, 100);
        game.setTeam2Score(0, 30);
        game.setTeam2Score(6,30);
        System.out.println(game.getTeam1Score(0));
        System.out.println(game.getTeam2Score(0));
        System.out.println(game.getTeam1Name());
        System.out.println(game.getTeam2Name());
    }
}