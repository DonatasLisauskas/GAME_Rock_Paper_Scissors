package game_elements.game_content;

import game_elements.enums.GameItems;
import game_elements.players.Opponents;
import game_elements.players.computer.ComputerPlayer;
import game_elements.players.first_player.FirstPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gameActions")
public class Game extends PlayGame implements GameActions {

    @Override
    public void gameLogic() {
        if (opponents1.getSelectedItem().equals(opponents2.getSelectedItem())) {
            System.out.println("\u001B[35m" + "Equals! " + opponents1.getClass().getName() + " and "
                    + opponents2.getClass().getName() + " selected: " + opponents1.getSelectedItem());
        }
        if (opponents1.getSelectedItem().equals(GameItems.ROCK.toString()) && opponents2.getSelectedItem().equals(GameItems.PAPER.toString())) {
        }
        opponents2Score.add(opponents2);

        if (opponents1.getSelectedItem().equals(GameItems.PAPER.toString()) && opponents2.getSelectedItem().equals(GameItems.ROCK.toString())) {
            opponents1Score.add(opponents1);
        }
        if (opponents1.getSelectedItem().equals(GameItems.ROCK.toString()) && opponents2.getSelectedItem().equals(GameItems.SCISSORS.toString())) {
            opponents1Score.add(opponents1);
        }
        if (opponents1.getSelectedItem().equals(GameItems.SCISSORS.toString()) && opponents2.getSelectedItem().equals(GameItems.ROCK.toString())) {
            opponents2Score.add(opponents2);
        }
        if (opponents1.getSelectedItem().equals(GameItems.PAPER.toString()) && opponents2.getSelectedItem().equals(GameItems.SCISSORS.toString())) {
            opponents2Score.add(opponents2);
        }
        if (opponents1.getSelectedItem().equals(GameItems.SCISSORS.toString()) && opponents2.getSelectedItem().equals(GameItems.PAPER.toString())) {
            opponents1Score.add(opponents1);
        }
    }


    @Override
    public void showResult() {
        whoWon();
        System.out.println(opponents1.getClass().getName() + " score: " + getOpponents1Score().size());
        System.out.println(opponents2.getClass().getName() + " score: " + getOpponents2Score().size());

    }

    @Override
    public void whoWon() {
        if (getOpponents1Score().size() == getOpponents2Score().size()) {
            System.out.println("\u001B[36m" + "The result is equal!");
        }
        if (getOpponents1Score().size() > getOpponents2Score().size()) {
            System.out.println("\u001B[36m" + "The " + opponents1.getClass().getName() + " won!");
        }
        if (getOpponents1Score().size() < getOpponents2Score().size()) {
            System.out.println("\u001B[36m" + "The " + opponents2.getClass().getName() + " won!");
        }
    }

    @Override
    public void playGame() {
        int round = 0;
        while (round < 6) {
            opponents1.selectItem();
            opponents2.selectItem();
            gameLogic();
            if (opponents1.getOpponentsActions().checkInput(opponents1) || opponents2.getOpponentsActions().checkInput(opponents2)) {
                round++;
            }
        }
        showResult();
    }
}
