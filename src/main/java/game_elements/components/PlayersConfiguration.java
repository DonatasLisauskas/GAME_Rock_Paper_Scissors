package game_elements.components;

import game_elements.entities.Opponents;
import game_elements.players_repository.computer.ComputerPlayer;
import game_elements.players_repository.first_player.FirstPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayersConfiguration {

    @Autowired
    @Qualifier("firstPlayer")
    protected Opponents opponents1;
    @Autowired
    @Qualifier("computerPlayer")
    protected Opponents opponents2;


    // OR BY THIS WAY
   /* protected Opponents opponents1;
    protected Opponents opponents2;
    public PlayersConfiguration(@Qualifier("firstPlayer") Opponents opponents1, @Qualifier("computerPlayer") Opponents opponents2) {
        this.opponents1 = opponents1;
        this.opponents2 = opponents2;
    }*/

    protected final List<Opponents> opponents1Score = new ArrayList<>();
    protected final List<Opponents> opponents2Score = new ArrayList<>();

    public List<Opponents> getOpponents1Score() {
        return opponents1Score;
    }

    public List<Opponents> getOpponents2Score() {
        return opponents2Score;
    }
}
