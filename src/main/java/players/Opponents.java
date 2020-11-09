package players;

public interface Opponents {

    String getSelectedItem();

    void setSelectedItem(String selectedItem);

    String getInput();

    void setInput(String input);

    void selectItem();

    OpponentsActions getOpponentsActions();

}
