package homeworks.homework14.drink;

public class Americano extends Drink {

    public Americano(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Американо");
    }

}
