package homework.homework4;

public class Airline {
    public static void main(String[] args) {

        printAirplaneInfo("1", "2");
        printAirplaneInfo("1", "2", 120);
        printAirplaneInfo("1", "2", 180, 28);

    }

    public static void printAirplaneInfo(String type, String model) {
        type = "Jet";
        model = "F-22 Raptor";
        System.out.println("Тип літака: " + type + ". Модель літака: " + model + ".");
    }

    public static void printAirplaneInfo(String type, String model, int economySeats) {
        type = "Airliner";
        model = "Aerobuss 737";
        System.out.println("Тип літака: " + type + ". Модель літака: " + model + ". Кількість місць в економкласі: " + economySeats + ".");

    }

    public static void printAirplaneInfo(String type, String model, int economySeats, int businessSeats) {
        type = "Airliner";
        model = "Boeing 777";
        System.out.println("Тип літака: " + type + ". Модель літака: " + model + ". Кількість місць в економкласі: " + economySeats + ". Кількість місць в бізнескласі: " + businessSeats + ".");


    }


}
