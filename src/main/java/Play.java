import game_content.Game;
import game_content.GameActions;
import players.computer.ComputerPlayer;
import players.first_player.FirstPlayer;

public class Play {
    public static void main(String[] args) {
      /*  ApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        PlayGame game = context.getBean(Game.class);
        game.playGame();*/

        GameActions playGame = new Game( new ComputerPlayer(), new ComputerPlayer());
        playGame.playGame();
    }
}
