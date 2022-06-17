package homeworks.homework14.Task2;

public class Latte extends CoffeeMachine{

    private int price;

    public Latte(String name, int price){
        super(name);
        this.price = price;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Лате");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Лате";
    }
}
