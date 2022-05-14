package homework.homework4;

public class Fuel {
    public static void main(String[] args) {

        double distance = 237;
        double fuel = 19;
        System.out.println("Расход топлива на 100 км " + Math.round(useFuel(fuel, distance)) + "л");
    }

    public static double useFuel(double fuel, double distance) {
        return fuel / (distance / 100);
    }

}
