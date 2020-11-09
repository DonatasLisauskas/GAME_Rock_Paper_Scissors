package SpringConfigurations;

import GameContent.Game;
import GameContent.PlayGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PlayerConfiguration.class)
public class GameConfiguration {

    @Bean
    public PlayGame getPlayGameBean() {
        return new Game();
    }

}