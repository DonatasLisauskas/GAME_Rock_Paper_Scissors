package game_content;

import players.Opponents;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PlayGame {
    protected Opponents opponents1;
    protected Opponents opponents2;

    protected final List<Opponents> opponents1Score = new ArrayList<>();
    protected final List<Opponents> opponents2Score = new ArrayList<>();

    @Autowired
    public PlayGame(Opponents opponents1, Opponents opponents2) {
        this.opponents1 = opponents1;
        this.opponents2 = opponents2;
    }

    public List<Opponents> getOpponents1Score() {
        return opponents1Score;
    }

    public List<Opponents> getOpponents2Score() {
        return opponents2Score;
    }
}
