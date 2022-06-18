package homeworks.homework14.Realty;

public class ResidentialRealty extends Realty {

    private final int rate;

    public ResidentialRealty(int totalArea, int unitTax, int rate) {
        super(totalArea, unitTax);
        this.rate = rate;
    }

    @Override
    public int calculateTax() {
        return rate * super.calculateTax() / 100;
    }

    @Override
    public String toString() {
        return "ResidentialRealty{" +
                "totalArea=" + totalArea +
                ", unitTax=" + unitTax +
                ", rate=" + rate +
                '}';
    }
}
