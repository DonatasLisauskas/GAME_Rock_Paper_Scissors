package Spring_Config;

import GameContent.Game;
import GameContent.PlayGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigPlayers.class)
public class ConfigGame {

    @Bean
    public PlayGame getPlayGameBean() {
        return new Game();
    }

}
