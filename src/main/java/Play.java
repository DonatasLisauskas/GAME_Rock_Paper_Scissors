import game_elements.game_content.Game;
import game_elements.game_content.GameActions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GameActions game = context.getBean("gameActions", Game.class);
        game.playGame();
    }
}
