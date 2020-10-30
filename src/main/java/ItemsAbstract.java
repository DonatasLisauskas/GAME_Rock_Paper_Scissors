import java.util.ArrayList;
import java.util.List;

public abstract class ItemsAbstract {

    protected final List<String> itemList = new ArrayList<String>();

    protected ItemsAbstract() {
        itemList.add("ROCK");
        itemList.add("PAPER");
        itemList.add("SCISSORS");
    }

    protected void showItems() {
        itemList.stream()
                .map(i -> "|" + i + "| ")
                .forEach(System.out::print);
    }


    protected abstract String selectItem();
}
