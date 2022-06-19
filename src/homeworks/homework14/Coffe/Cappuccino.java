package homeworks.homework14.Coffe;

public class Cappuccino extends Beverages {

    public Cappuccino(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Капучіно");
    }

}
