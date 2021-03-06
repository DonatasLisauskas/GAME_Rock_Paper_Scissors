package game_elements.entities;

import game_elements.components.OpponentsActions;

public interface Opponents {

    String getSelectedItem();

    void setSelectedItem(String selectedItem);

    String getInput();

    void setInput(String input);

    void selectItem();

    OpponentsActions getOpponentsActions();

}
