package Players;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemsAbstract {

    private final List<String> itemList = new ArrayList<String>();

    protected ItemsAbstract() {
        itemList.add("ROCK");
        itemList.add("PAPER");
        itemList.add("SCISSORS");
    }

    public List<String> getItemList() {
        return itemList;
    }

    protected abstract String selectItem();
}
