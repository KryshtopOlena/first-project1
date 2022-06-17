package homeworks.homework14.Task1;

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

}
