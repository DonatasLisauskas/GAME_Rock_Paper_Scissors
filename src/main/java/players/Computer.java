package players;

import java.util.Random;

public class Computer extends Items {

    private final Random random = new Random();
    private String itemOfComputer;

    public String getItemOfComputer() {
        return itemOfComputer;
    }

    @Override
    public String selectItem() {
        int randomId = random.nextInt(getItemList().size());
        itemOfComputer = getItemList().get(randomId);
        System.out.println("\u001B[31m" + "Computer selected: " + itemOfComputer);
        return itemOfComputer;
    }
}
