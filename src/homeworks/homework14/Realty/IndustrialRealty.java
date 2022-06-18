package homeworks.homework14.Realty;

public class IndustrialRealty extends Realty {

    public IndustrialRealty(int totalArea, int unitTax) {
        super(totalArea, unitTax);
    }

    @Override
    public String toString() {
        return "IndustrialRealty{" +
                "totalArea=" + totalArea +
                ", unitTax=" + unitTax +
                '}';
    }
}
