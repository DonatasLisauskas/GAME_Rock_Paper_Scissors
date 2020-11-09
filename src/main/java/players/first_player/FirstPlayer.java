package players.first_player;

import players.Opponents;
import players.OpponentsActions;

public class FirstPlayer implements Opponents {

    private String selectedItem;

    protected String input;

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
        return input;
    }

    @Override
    public void setInput(String input) {
        this.input=input;
    }

    @Override
    public void selectItem() {
        getOpponentsActions().setOpponentItem(this);
    }

    @Override
    public OpponentsActions getOpponentsActions() {
        return new OpponentsActions();
    }

}
