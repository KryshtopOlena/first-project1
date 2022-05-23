package homework.homework6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramReadParameters {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть дані для обчислення : ");

        double number1 = Double.parseDouble(reader.readLine());
        char operation = reader.readLine().charAt(0);
        double number2 = Double.parseDouble(reader.readLine());

        if (number2 == 0 && operation == '/') {
            System.out.println("На нуль ділити не можна");
            return;
        }

        System.out.println(calculateResult(number1, number2, operation));
    }


    public static double calculateResult(double number1, double number2, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = calculateAddition(number1, number2);
            case '-' -> result = calculateDeduction(number1, number2);
            case '*' -> result = calculateMultiplication(number1, number2);
            case '/' -> result = calculateDivine(number1, number2);
            default -> System.out.println("Дані внесено не корректно.");
        }
        return result;
    }

    public static double calculateAddition(double number1, double number2) {
        return number1 + number2;
    }

    public static double calculateDeduction(double number1, double number2) {
        return number1 - number2;
    }

    public static double calculateMultiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double calculateDivine(double number1, double number2) {
        return number1 / number2;
    }

}
