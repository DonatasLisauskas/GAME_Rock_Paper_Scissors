import java.util.Random;

public class Computer extends ItemsAbstract {

    private final Random random = new Random();
    protected String itemOfComputer;

    @Override
    public String selectItem() {
        int randomId = random.nextInt(getItemList().size());
        itemOfComputer = getItemList().get(randomId);
        System.out.println("\u001B[31m" + "Computer selected: " + itemOfComputer);
        return itemOfComputer;
    }
}
