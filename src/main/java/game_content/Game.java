package game_content;

import players.ComputerPlayer;
import players.UserPlayer;

public class Game extends PlayGame {

    @Override
    protected void gameLogic() {
        if (computer.getItemOfComputer().equals(player.getItemOfPlayer())) {
            System.out.println("\u001B[35m" + "Equals! Computer: " + computer.getItemOfComputer() +
                    " || Player: " + player.getItemOfPlayer());
        }
        if (computer.getItemOfComputer().equals("ROCK") && player.getItemOfPlayer().equals("PAPER")) {
            getPlayerScore().add(new UserPlayer());
        }
        if (computer.getItemOfComputer().equals("ROCK") && player.getItemOfPlayer().equals("SCISSORS")) {
            getComputerScore().add(new ComputerPlayer());
        }
        if (computer.getItemOfComputer().equals("SCISSORS") && player.getItemOfPlayer().equals("ROCK")) {
            getPlayerScore().add(new UserPlayer());
        }
        if (computer.getItemOfComputer().equals("SCISSORS") && player.getItemOfPlayer().equals("PAPER")) {
            getComputerScore().add(new ComputerPlayer());
        }
        if (computer.getItemOfComputer().equals("PAPER") && player.getItemOfPlayer().equals("ROCK")) {
            getComputerScore().add(new ComputerPlayer());
        }
        if (computer.getItemOfComputer().equals("PAPER") && player.getItemOfPlayer().equals("SCISSORS")) {
            getPlayerScore().add(new UserPlayer());
        }
    }

    @Override
    protected void showResult() {
        whoWon();
        System.out.println("Computer score: " + getComputerScore().size());
        System.out.println("Player score: " + getPlayerScore().size());

    }

    @Override
    protected void whoWon() {
        if (getComputerScore().size() == getPlayerScore().size()) {
            System.out.println("\u001B[36m" + "The result is equal!");
        }
        if (getComputerScore().size() > getPlayerScore().size()) {
            System.out.println("\u001B[36m" + "The Computer won!");
        }
        if (getComputerScore().size() < getPlayerScore().size()) {
            System.out.println("\u001B[36m" + "Congrats, You won!");
        }
    }

    @Override
    public void playGame() {
        int round = 0;
        while (round < 6) {
            player.selectItem();
            computer.selectItem();
            gameLogic();
            if (player.checkInput()) {
                round++;
            }
        }
        showResult();
    }
}
