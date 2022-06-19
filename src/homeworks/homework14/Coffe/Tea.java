package homeworks.homework14.Coffe;

public class Tea extends Beverages {

    public Tea(String name, int price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Чай");
    }

}
