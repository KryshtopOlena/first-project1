package homeworks.homework14.Realty;

public class CommercialRealty extends Realty {

    private final int tradeProceeds;

    public CommercialRealty(int totalArea, int unitTax, int tradeProceeds) {
        super(totalArea, unitTax);
        this.tradeProceeds = tradeProceeds;
    }

    @Override
    public int calculateTax() {
        int sumTax = super.calculateTax();
        if (tradeProceeds < 100) {
            sumTax = 0;
        }
        return sumTax;
    }

    @Override
    public String toString() {
        return "CommercialRealty{" +
                "tradeProceeds=" + tradeProceeds +
                ", totalArea=" + totalArea +
                ", unitTax=" + unitTax +
                '}';
    }
}
