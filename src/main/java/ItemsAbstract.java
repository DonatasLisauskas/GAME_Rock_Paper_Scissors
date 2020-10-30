import java.util.ArrayList;
import java.util.List;

public abstract class ItemsAbstract {

    protected final List<String> itemList = new ArrayList<String>();

    protected ItemsAbstract() {
        itemList.add("ROCK");
        itemList.add("PAPER");
        itemList.add("SCISSORS");
    }

    protected abstract String selectItem();
}
