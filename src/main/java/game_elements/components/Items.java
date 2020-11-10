package game_elements.components;

import game_elements.enums.GameItems;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
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
