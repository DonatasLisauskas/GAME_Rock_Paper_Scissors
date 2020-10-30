import java.util.Random;

public class Computer extends ItemsAbstract {

    private final Random random = new Random();
    protected String getItemOfComputer;

    @Override
    public String selectItem() {
        int randomId = random.nextInt(itemList.size());
        getItemOfComputer = itemList.get(randomId);
        System.out.println("Computer selected: " + getItemOfComputer);
        return getItemOfComputer;
    }

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.showItems();

        System.out.println(computer.selectItem());
    }
}
