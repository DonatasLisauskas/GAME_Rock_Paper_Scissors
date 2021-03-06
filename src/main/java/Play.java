import game_elements.services.GameService;
import game_elements.entities.GameActions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GameActions game = context.getBean("gameActions", GameService.class);
        game.playGame();
    }
}
