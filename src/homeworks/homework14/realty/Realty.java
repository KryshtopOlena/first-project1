package homeworks.homework14.realty;

public class Realty {

    protected int totalArea;
    protected int unitTax;

    public Realty(int totalArea, int unitTax) {
        this.totalArea = totalArea;
        this.unitTax = unitTax;
    }

    public int calculateTax() {
        return totalArea * unitTax;
    }

    @Override
    public String toString() {
        return "Realty{" +
                "totalArea=" + totalArea +
                ", unitTax=" + unitTax +
                '}';
    }
}
