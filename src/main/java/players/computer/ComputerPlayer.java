package players.computer;

import players.Items;
import players.Opponents;
import players.OpponentsActions;

import java.util.Random;

public class ComputerPlayer extends Items implements Opponents{

    private String selectedItem;

    private final Random random = new Random();

    @Override
    public String getSelectedItem() {
        return selectedItem;
    }

    @Override
    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    @Override
    public String getInput() {
        return null;
    }

    @Override
    public void setInput(String input) {

    }

    @Override
    public void selectItem() {
        int randomId = random.nextInt(getItemList().size());
        String item = getItemList().get(randomId).toString();
        setSelectedItem(item);
        System.out.println("\u001B[31m" + "Computer selected: " + item);
    }

    @Override
    public OpponentsActions getOpponentsActions() {
        return new OpponentsActions();
    }
}
