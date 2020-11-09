import game_content.Game;
import game_content.PlayGame;
import spring_configurations.GameConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        PlayGame game = context.getBean(Game.class);
        game.playGame();
    }
}
