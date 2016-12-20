/**
 * Created by Fred Sus on 19/12/2016.
 */
public class DemoHSBaseballGame {
    public static void main(String[] args)
    {
        HighSchoolBaseballGame game = new HighSchoolBaseballGame("Chelsea", "Juventus");
        game.setTeam1Score(0, 20);
        game.setTeam2SCore(2, 100);
        game.setTeam2SCore(0, 30);
        game.setTeam2SCore(8,30);
        System.out.println(game.getTeam1Score(0));
        System.out.println(game.getTeam2SCore(0));
        System.out.println(game.getTeam1Name());
        System.out.println(game.getTeam2Name());
    }
}