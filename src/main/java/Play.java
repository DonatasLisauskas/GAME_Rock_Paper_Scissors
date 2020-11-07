import GameContent.Game;
import GameContent.PlayGame;
import Spring_Config.ConfigGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play {
    public static void main(String[] args) {
     /*   PlayGame newGame = new Game();
        newGame.playGame();*/

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigGame.class);
        PlayGame game = context.getBean(Game.class);
        game.playGame();
    }
}
