package homeworks.homework15.degree;

public class Kelvin extends Degree implements Converter {

    private final double celsius;

    public Kelvin(String name, double celsius) {
        super(name);
        this.celsius = celsius;
    }

    @Override
    public double covert() {
        return celsius + 273.15;
    }

}
