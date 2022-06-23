package homeworks.homework15.degree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Degree {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int celsius = getCelsius();
        String nameToCovert = getNameToCovert();
        createConverter(nameToCovert);
        printDegree(celsius, nameToCovert);
    }

    public static int getCelsius() throws IOException {
        System.out.println("Введи значення градусів Цельсія");
        int celsius = Integer.parseInt(READER.readLine());
        int minTemperature = -273;
        if (celsius < minTemperature) {
            System.out.println("Ви вийшли за межі шкали температур.");
            return getCelsius();
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
            return getNameToCovert();
        }
    }

    public static void printDegree(int celsius, String nameToCovert) {
        Convertible convertible = createConverter(nameToCovert);
        double result = convertible.covert(celsius);
        System.out.println("При конвертації " + celsius + " градусів Цельсія ми маємо " + result + " градусів");

    }

    public static Convertible createConverter(String nameToCovert){
        String kel = "k";
        if(nameToCovert.equalsIgnoreCase(kel)){
            return new Kelvin();
        } else {
            return new Fahrenheit();
        }
    }
}
