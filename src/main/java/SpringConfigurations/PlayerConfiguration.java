package SpringConfigurations;

import Players.Computer;
import Players.ItemsAbstract;
import Players.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfiguration {

    @Bean
    public ItemsAbstract getPlayerBean() {
        return new Player();
    }

    @Bean
    public ItemsAbstract getComputerPlayerBean() {
        return new Computer();
    }

}
