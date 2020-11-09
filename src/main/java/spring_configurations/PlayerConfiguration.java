package spring_configurations;

import players.Computer;
import players.Items;
import players.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfiguration {

    @Bean
    public Items getPlayerBean() {
        return new Player();
    }

    @Bean
    public Items getComputerPlayerBean() {
        return new Computer();
    }

}
