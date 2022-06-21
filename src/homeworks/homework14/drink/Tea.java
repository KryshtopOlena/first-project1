package homeworks.homework14.drink;

public class Tea extends Drink {

    public Tea(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Чай");
    }

}
