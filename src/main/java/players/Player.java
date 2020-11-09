package players;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Player extends ItemsAbstract {

    private String input;
    private String itemOfPlayer;

    public String getItemOfPlayer() {
        return itemOfPlayer;
    }

    @Override
    public String selectItem() {
        System.out.println("\u001B[34m" + "Enter ROCK or PAPER or SCISSORS");
        scanner();
        checkInput();
        if (itemOfPlayer != null) {
            System.out.println("\u001B[32m" + "You selected: " + itemOfPlayer);
            return itemOfPlayer;
        } else {
            return this.selectItem();
        }
    }

    public Boolean checkInput() {
        itemOfPlayer = null;
        String regexp = "[rR][oO][cC][kK]|[pP][aA][pP][eE][rR]|[sS][cC][iI][sS][sS][oO][rR][sS]";
        boolean matchFound = input.matches(regexp);
        if (matchFound) {
            itemOfPlayer = getItemList().stream()
                    .filter(find -> find.startsWith(input.toUpperCase()))
                    .collect(Collectors.joining());
            return true;
        } else {
            System.out.println("Invalid value! Please enter ROCK or PAPER or SCISSORS");
            return false;
        }
    }

    private void scanner() {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
    }
}
