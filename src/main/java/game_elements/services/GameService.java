package game_elements.services;

import game_elements.entities.GameActions;
import game_elements.entities.Opponents;
import game_elements.enums.GameItems;
import game_elements.components.PlayersConfiguration;
import game_elements.players_repository.computer.ComputerPlayer;
import game_elements.players_repository.first_player.FirstPlayer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("gameActions")
public class GameService extends PlayersConfiguration implements GameActions {


    // OR BY THIS WAY
    /*public GameService(@Qualifier("firstPlayer")Opponents opponents1,@Qualifier("computerPlayer") Opponents opponents2) {
        super(opponents1, opponents2);
    }*/

    @Override
    public void gameLogic() {
        if (opponents1.getSelectedItem().equals(opponents2.getSelectedItem())) {
            System.out.println("\u001B[35m" + "Equals! " + opponents1.getClass().getName() + " and "
                    + opponents2.getClass().getName() + " selected: " + opponents1.getSelectedItem());
        }
        if (opponents1.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.ROCK))
                && opponents2.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.PAPER))) {
            opponents2Score.add(opponents2);
        }
        if (opponents1.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.PAPER))
                && opponents2.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.ROCK))) {
            opponents1Score.add(opponents1);
        }
        if (opponents1.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.ROCK))
                && opponents2.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.SCISSORS))) {
            opponents1Score.add(opponents1);
        }
        if (opponents1.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.SCISSORS))
                && opponents2.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.ROCK))) {
            opponents2Score.add(opponents2);
        }
        if (opponents1.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.PAPER))
                && opponents2.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.SCISSORS))) {
            opponents2Score.add(opponents2);
        }
        if (opponents1.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.SCISSORS))
                && opponents2.getSelectedItem().equalsIgnoreCase(String.valueOf(GameItems.PAPER))) {
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
