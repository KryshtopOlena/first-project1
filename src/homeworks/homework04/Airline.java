package homeworks.homework04;

public class Airline {
    public static void main(String[] args) {

        String type = "Airliner";
        String model = "Boeing 777";
        int economySeats = 180;
        int businessSeats = 28;

        printAirplaneInfo("1", "2");
        printAirplaneInfo("1", "2", 120);
        printAirplaneInfo(type, model, economySeats, businessSeats);

    }

    public static void printAirplaneInfo(String type, String model) {

        System.out.println("Тип літака: " + type + ". Модель літака: " + model + ".");
    }

    public static void printAirplaneInfo(String type, String model, int economySeats) {

        System.out.println("Тип літака: " + type + ". Модель літака: " + model + ". Кількість місць в економкласі: " + economySeats + ".");

    }

    public static void printAirplaneInfo(String type, String model, int economySeats, int businessSeats) {

        System.out.println("Тип літака: " + type + ". Модель літака: " + model + ". Кількість місць в економкласі: " + economySeats + ". Кількість місць в бізнескласі: " + businessSeats + ".");


    }


}
