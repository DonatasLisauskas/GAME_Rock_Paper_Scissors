package spring_configurations;

import players.ComputerPlayer;
import players.Players;
import players.UserPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfiguration {

    @Bean
    public Players getPlayerBean() {
        return new UserPlayer();
    }

    @Bean
    public Players getComputerPlayerBean() {
        return new ComputerPlayer();
    }

}
