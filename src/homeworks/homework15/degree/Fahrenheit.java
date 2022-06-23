package homeworks.homework15.degree;

public class Fahrenheit implements Convertible {

    public Fahrenheit() {
    }

    @Override
    public double covert(int celsius) {
        return (celsius * 1.8) + 32;
    }

}
