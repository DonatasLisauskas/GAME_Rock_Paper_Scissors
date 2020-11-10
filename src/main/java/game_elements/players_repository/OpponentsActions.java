package game_elements.players_repository;

import game_elements.components.Items;
import game_elements.entities.Actions;
import game_elements.entities.Opponents;
import org.springframework.stereotype.Component;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class OpponentsActions extends Items implements Actions {

    @Override
    public void setOpponentItem(Opponents opponents) {
        System.out.println("\u001B[34m" + "Enter ROCK or PAPER or SCISSORS");
        scanner(opponents);
        if (Boolean.TRUE.equals(checkInput(opponents))) {
            String item = getItemList().stream()
                    .filter(find -> find.toString().equalsIgnoreCase(opponents.getInput()))
                    .map(Enum::toString)
                    .collect(Collectors.joining());
            opponents.setSelectedItem(item);
            System.out.println("\u001B[32m" + "You selected: " + opponents.getSelectedItem());
        } else {
            setOpponentItem(opponents);
        }
    }

    @Override
    public Boolean checkInput(Opponents opponents) {
        String regexp = "[rR][oO][cC][kK]+|[pP][aA][pP][eE][rR]|[sS][cC][iI][sS][sS][oO][rR][sS]";
        boolean matchFound = opponents.getInput().matches(regexp);
        if (matchFound) {
            return true;
        } else {
            System.out.println("Invalid value! Please enter ROCK or PAPER or SCISSORS");
            return false;
        }
    }

    @Override
    public void scanner(Opponents opponents) {
        Scanner scanner = new Scanner(System.in);
        opponents.setInput(scanner.nextLine());
    }
}
