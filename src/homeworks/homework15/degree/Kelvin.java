package homeworks.homework15.degree;

public class Kelvin implements Convertible {

    public Kelvin() {
    }

    @Override
    public double covert(int celsius) {
        return celsius + 273.15;
    }

}
