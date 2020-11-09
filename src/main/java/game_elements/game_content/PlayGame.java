package game_elements.game_content;

import game_elements.players.Opponents;
import game_elements.players.computer.ComputerPlayer;
import game_elements.players.first_player.FirstPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayGame {

    @Autowired
    @Qualifier("firstPlayer")
    protected FirstPlayer opponents1;
    @Autowired
    @Qualifier("computerPlayer")
    protected ComputerPlayer opponents2;

    protected final List<FirstPlayer> opponents1Score = new ArrayList<>();
    protected final List<ComputerPlayer> opponents2Score = new ArrayList<>();

    public List<FirstPlayer> getOpponents1Score() {
        return opponents1Score;
    }

    public List<ComputerPlayer> getOpponents2Score() {
        return opponents2Score;
    }
}
