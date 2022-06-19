package homeworks.homework14.Coffe;

public class Latte extends Beverages {

    public Latte(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Лате");
    }

}
