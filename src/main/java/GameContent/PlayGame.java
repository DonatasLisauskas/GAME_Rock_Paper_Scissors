package GameContent;

import Players.Computer;
import Players.Player;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public abstract class PlayGame {

    @Autowired
    protected Computer computer;
    @Autowired
    protected Player player;

    private final List<Computer> computerScore = new ArrayList<Computer>();
    private final List<Player> playerScore = new ArrayList<Player>();

    public List<Computer> getComputerScore() {
        return computerScore;
    }

    public List<Player> getPlayerScore() {
        return playerScore;
    }

    protected abstract void gameLogic();

    protected abstract void showResult();

    protected abstract void whoWon();

    public abstract void playGame();

}
