package homeworks.homework14.Coffe;

public class Americano extends Beverages {

    public Americano(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Американо");
    }

}
