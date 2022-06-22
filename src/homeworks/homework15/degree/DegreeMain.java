package homeworks.homework15.degree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DegreeMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int celsius = getCelsius();
        String nameToCovert = getNameToCovert();
        printDegree(celsius, nameToCovert);
    }

    public static int getCelsius() throws IOException {
        System.out.println("Введи значення градусів Цельсія");
        int celsius = Integer.parseInt(READER.readLine());
        int minTemperature = -273;
        if (celsius < minTemperature) {
            System.out.println("Ви вийшли за межі шкали температур.");
            getCelsius();
        }
        return celsius;
    }

    public static String getNameToCovert() throws IOException {
        System.out.println("Введи k для отримання градусів Кельвіна");
        System.out.println("Введи f для отримання градусів Фаренгейта");
        String nameToCovert = READER.readLine();
        String kel = "k";
        String fahr = "f";
        if (nameToCovert.equalsIgnoreCase(kel) || nameToCovert.equalsIgnoreCase(fahr)) {
            return nameToCovert;
        } else {
            System.out.println("Ви ввели невірне значення, повторіть");
            getNameToCovert();
        }
        return nameToCovert;
    }

    public static void printDegree(int celsius, String nameToCovert) {
        String kel = "k";
        String fahr = "f";
        Kelvin kelvin = new Kelvin("градуси Фаренгейта Кельвіна", celsius);
        Fahrenheit fahrenheit = new Fahrenheit("градуси Фаренгейта", celsius);
        if (nameToCovert.equalsIgnoreCase(kel)) {
            double kelvinResult = (kelvin).covert();
            System.out.println("При конвертації " + celsius + " градусів Цельсія ми маємо " + kelvinResult + " градусів Кельвіна");
        } else if (nameToCovert.equalsIgnoreCase(fahr)){
            double fahrenheitResult = (fahrenheit).covert();
            System.out.println("При конвертації " + celsius + " градусів Цельсія ми маємо " + fahrenheitResult + " градусів Фаренгейта");
        }
    }
}
