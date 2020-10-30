import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Player extends ItemsAbstract {

    private String input;
    protected String getItemOfPlayer;

    @Override
    public String selectItem() {
        System.out.println("\u001B[34m" + "Enter ROCK or PAPER or SCISSORS");
        scanner();
        checkInput();
        if (getItemOfPlayer != null) {
            System.out.println("\u001B[32m" + "You selected: " + getItemOfPlayer);
            return getItemOfPlayer;
        } else {
            return this.selectItem();
        }
    }

    protected Boolean checkInput() {
        getItemOfPlayer = null;
        String regexp = "[rR][oO][cC][kK]|[pP][aA][pP][eE][rR]|[sS][cC][iI][sS][sS][oO][rR][sS]";
        boolean matchFound = input.matches(regexp);
        if (matchFound) {
            getItemOfPlayer = itemList.stream()
                    .filter(find -> find.startsWith(input.toUpperCase()))
                    .collect(Collectors.joining());
            return true;
        } else {
            System.out.println("Invalid value! Please enter ROCK or PAPER or SCISSORS");
            return false;
        }
    }

    private void scanner() {
        try {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Invalid value ! Your value must be integer since 1 to 3 inclusive !");
            this.scanner();
        }
    }
}
