/**
 * Created by Fred Sus on 19/12/2016.
 */
public class DemoBaseballGame {
    public static void main(String[] args)
    {
        BaseballGame game = new BaseballGame("Chelsea","Juventus");
        game.setTeam1Score(0,20);
        game.setTeam2Score(2,100);
        game.setTeam2Score(0,30);
        System.out.println(game.getTeam1Score(0));
        System.out.println(game.getTeam2Score(0));
        System.out.println(game.getTeam1Name());
        System.out.println(game.getTeam2Name());
    }
}
