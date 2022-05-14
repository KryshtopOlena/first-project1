package homework.homework4;

public class Fuel {
    public static void main(String[] args) {

        double distance = 237;
        double fuel = 19;
        double outputHundreds = convertConstantValue(distance);
        System.out.println("Расход топлива на 100 км " + Math.round(useFuel(fuel, outputHundreds)) + "л");
    }

    public static double convertConstantValue(double sum) {
        return sum / 100;
    }

    public static double useFuel(double fuel, double distance) {
        return fuel / distance;
    }

}
