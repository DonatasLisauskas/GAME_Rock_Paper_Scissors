package game_elements.players_repository.first_player;

import game_elements.entities.Opponents;
import game_elements.players_repository.OpponentsActions;
import org.springframework.stereotype.Repository;

@Repository("firstPlayer")
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