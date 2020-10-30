import java.util.ArrayList;
import java.util.List;

public abstract class PlayGame {
    protected Computer computer;
    protected Player player;

    protected PlayGame(){
        computer = new Computer();
        player = new Player();
    }

    protected final List<Computer> computerScore = new ArrayList<Computer>();
    protected final List<Player> playerScore = new ArrayList<Player>();

    protected abstract void gameLogic();

    protected abstract void showResult();

    protected abstract void whoWon();

    protected abstract void playGame();

}
