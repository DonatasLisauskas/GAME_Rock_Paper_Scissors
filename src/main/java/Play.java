import game_elements.game_content.Game;
import game_elements.game_content.GameActions;
import game_elements.players.computer.ComputerPlayer;
import game_elements.players.first_player.FirstPlayer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play {
    public static void main(String[] args) {
      /*  ApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        PlayGame game = context.getBean(Game.class);
        game.playGame();*/

      /*  GameActions playGame = new Game( new FirstPlayer(), new ComputerPlayer());
        playGame.playGame();*/

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GameActions game = context.getBean("gameActions", Game.class);

        game.playGame();


    }
}
