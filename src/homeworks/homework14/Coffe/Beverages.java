package homeworks.homework14.Coffe;

public class Beverages {

    private final String name;
    protected int price;

    public void prepare() {
        System.out.println("Замовлення готується...");
    }

    public Beverages(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Beverages{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
