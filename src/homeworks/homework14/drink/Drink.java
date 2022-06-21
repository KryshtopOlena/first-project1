package homeworks.homework14.drink;

public class Drink {

    private final String name;
    protected int price;

    public void prepare() {
        System.out.println("Замовлення готується...");
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
