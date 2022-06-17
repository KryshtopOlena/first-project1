package homeworks.homework14.Task2;

public class Americano extends CoffeeMachine {

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public Americano(String name, int price){
        super(name);
        this.price = price;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Американо");
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Амерікано";
    }
}
