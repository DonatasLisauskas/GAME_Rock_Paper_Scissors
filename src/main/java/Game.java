public class Game extends PlayGame {

    @Override
    protected void gameLogic() {
        if (computer.itemOfComputer.equals(player.itemOfPlayer)) {
            System.out.println("\u001B[35m" + "Equals! Computer: " + computer.itemOfComputer + " || Player: " + player.itemOfPlayer);
        }
        if (computer.itemOfComputer.equals("ROCK") && player.itemOfPlayer.equals("PAPER")) {
            playerScore.add(new Player());
        }
        if (computer.itemOfComputer.equals("ROCK") && player.itemOfPlayer.equals("SCISSORS")) {
            computerScore.add(new Computer());
        }
        if (computer.itemOfComputer.equals("SCISSORS") && player.itemOfPlayer.equals("ROCK")) {
            playerScore.add(new Player());
        }
        if (computer.itemOfComputer.equals("SCISSORS") && player.itemOfPlayer.equals("PAPER")) {
            computerScore.add(new Computer());
        }
        if (computer.itemOfComputer.equals("PAPER") && player.itemOfPlayer.equals("ROCK")) {
            computerScore.add(new Computer());
        }
        if (computer.itemOfComputer.equals("PAPER") && player.itemOfPlayer.equals("SCISSORS")) {
            playerScore.add(new Player());
        }
    }

    @Override
    protected void showResult() {
        whoWon();
        System.out.println("Computer score: " + computerScore.size());
        System.out.println("Player score: " + playerScore.size());

    }

    @Override
    protected void whoWon() {
        if (super.computerScore.size() == playerScore.size()) {
            System.out.println("\u001B[36m" + "The result is equal!");
        }
        if (super.computerScore.size() > playerScore.size()) {
            System.out.println("\u001B[36m" + "The Computer won!");
        }
        if (super.computerScore.size() < playerScore.size()) {
            System.out.println("\u001B[36m" + "Congrats, You won!");
        }
    }

    @Override
    protected void playGame() {
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
