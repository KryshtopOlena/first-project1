package homework.homework5;

import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть свої оцінки:");
        System.out.print("1)");
        int first = in.nextInt();
        System.out.print("2)");
        int second = in.nextInt();
        System.out.print("3)");
        int third = in.nextInt();
        System.out.print("4)");
        int fourth = in.nextInt();
        System.out.print("5)");
        int fifth = in.nextInt();
        if (!isValid(first, second, third, fourth, fifth)) {
            System.out.println("Оцінки введено не коректно");
            return;
        }
        calculateScholarship(calculateAverageMark(first, second, third, fourth, fifth));
    }

    public static void calculateScholarship(double averageMark) {
        int upperLimit = 10;
        int lowerLimit = 8;
        if (averageMark >= upperLimit) {
            System.out.println("Вітаю! Ти отримаєш підвищену стипендію! Молодець!");
        } else if (averageMark >= lowerLimit) {
            System.out.println("Вітаю! Стипендія в тебе в кармані!");
        } else {
            System.out.println("Ти прогавив своє щастя(");
        }
    }

    public static double calculateAverageMark(int first, int second, int third, int fourth, int fifth) {
        return (double) (first + second + third + fourth + fifth) / 5;
    }

    public static boolean isValid(int first, int second, int third, int fourth, int fifth) {
        return first <= 12 && first >= 0 && second <= 12 && second >= 0 &&
                third <= 12 && third >= 0 && fourth <= 12 && fourth >= 0 && fifth <= 12 && fifth >= 0;
    }

}
