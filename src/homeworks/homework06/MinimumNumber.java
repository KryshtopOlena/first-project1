package homeworks.homework06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 3 будь-яких числа: ");
        System.out.print("1) ");
        double number1 = Double.parseDouble(reader.readLine());
        System.out.print("2) ");
        double number2 = Double.parseDouble(reader.readLine());
        System.out.print("3) ");
        double number3 = Double.parseDouble(reader.readLine());
        System.out.println(findMin(number1, number2,number3));

    }
    public static double findMin(double number1, double number2, double number3) {
        double min = number1;
        if (number2 < min) {
            min = number2;
        } else if (number3 < min){
            min = number3;
        }
        return min;
    }
}
