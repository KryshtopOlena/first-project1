package homeworks.homework15.degree;

public class Fahrenheit extends Degree implements Converter {

    private final double celsius;

    public Fahrenheit(String name, double celsius) {
        super(name);
        this.celsius = celsius;
    }

    @Override
    public double covert() {
        return (celsius * 1.8) + 32;
    }

}
