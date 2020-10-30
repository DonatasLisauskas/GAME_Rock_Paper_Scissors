public class Game extends PlayGame {

    @Override
    protected void gameLogic() {
        if (computer.getItemOfComputer.equals(player.getItemOfPlayer)) {
            System.out.println("Equals! Computer: " + computer.getItemOfComputer + " || Player: " + player.getItemOfPlayer);
        }
        if (computer.getItemOfComputer.equals("ROCK") && player.getItemOfPlayer.equals("PAPER")) {
            playerScore.add(new Player());
        }
        if (computer.getItemOfComputer.equals("ROCK") && player.getItemOfPlayer.equals("SCISSORS")) {
            computerScore.add(new Computer());
        }
        if (computer.getItemOfComputer.equals("SCISSORS") && player.getItemOfPlayer.equals("ROCK")) {
            playerScore.add(new Player());
        }
        if (computer.getItemOfComputer.equals("SCISSORS") && player.getItemOfPlayer.equals("PAPER")) {
            computerScore.add(new Computer());
        }
        if (computer.getItemOfComputer.equals("PAPER") && player.getItemOfPlayer.equals("ROCK")) {
            computerScore.add(new Computer());
        }
        if (computer.getItemOfComputer.equals("PAPER") && player.getItemOfPlayer.equals("SCISSORS")) {
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
            System.out.println("The result is equal!");
        }
        if (super.computerScore.size() > playerScore.size()) {
            System.out.println("The Computer won!");
        }
        if (super.computerScore.size() < playerScore.size()) {
            System.out.println("Congrats, You won!");
        }
    }

    @Override
    protected void playGame() {
       int round = 0;

       while (round < 6) {
           player.selectItem();
           computer.selectItem();
           gameLogic();
           round ++;
       }
        showResult();
    }

}
