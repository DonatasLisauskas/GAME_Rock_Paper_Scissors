package players;

import enums.GameItems;
import java.util.ArrayList;
import java.util.List;

public class Items {

    private final List<GameItems> itemList = new ArrayList<>();

    protected Items() {
        itemList.add(GameItems.ROCK);
        itemList.add(GameItems.PAPER);
        itemList.add(GameItems.SCISSORS);
    }

    public List<GameItems> getItemList() {
        return itemList;
    }
}
