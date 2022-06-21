package homeworks.homework14.realty;

public class ResidentialRealty extends Realty {

    private final int rate;

    public ResidentialRealty(int totalArea, int unitTax, int rate) {
        super(totalArea, unitTax);
        this.rate = rate;
    }

    @Override
    public int calculateTax() {
        int sumTax = super.calculateTax();
        return sumTax - (rate * sumTax / 100);
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
