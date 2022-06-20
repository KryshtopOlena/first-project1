package homeworks.homework14.Drink;

public class Cappuccino extends Drink {

    public Cappuccino(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Капучіно");
    }

}
