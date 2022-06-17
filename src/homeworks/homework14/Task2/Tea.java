package homeworks.homework14.Task2;

public class Tea extends CoffeeMachine{

    private int price;

    public Tea(String name, int price){
        super(name);
        this.price = price;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Чай");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Чай";
    }
}
