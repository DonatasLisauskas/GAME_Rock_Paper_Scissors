package game_content;

import players.ComputerPlayer;
import players.UserPlayer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayGame {

    @Autowired
    protected ComputerPlayer computer;
    @Autowired
    protected UserPlayer player;

    private final List<ComputerPlayer> computerScore = new ArrayList<>();
    private final List<UserPlayer> playerScore = new ArrayList<>();

    public List<ComputerPlayer> getComputerScore() {
        return computerScore;
    }

    public List<UserPlayer> getPlayerScore() {
        return playerScore;
    }

    protected abstract void gameLogic();

    protected abstract void showResult();

    protected abstract void whoWon();

    public abstract void playGame();

}
