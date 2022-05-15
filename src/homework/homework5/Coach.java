package homework.homework5;

import java.util.Scanner;

public class Coach {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введіть свої оцінки:");
        System.out.print("1.");
        int first = in.nextInt();
        System.out.print("2.");
        int second = in.nextInt();
        System.out.print("3.");
        int third = in.nextInt();
        System.out.print("4.");
        int fourth = in.nextInt();
        System.out.print("5.");
        int fifth = in.nextInt();

        System.out.print("Ваші дані: " + first + second + third + fourth + fifth);
        in.close();
    }
    public static int calculateScolarship() {
        int upperLimit = 10;
        int lowerLimit = 7;
        if (calculateAverageMark() > 9) {
            System.out.println("Вітаю! Ти отримаєш підвищену стипендію! Молодець");
        }
        else if (calculateAverageMark() <= 9 && calculateAverageMark() >= 7 ){
            System.out.println("Вітаю! Стипендія в тебе в кармані!");
        } else {
            System.out.println("Ти прогавив своє щастя(");
        }
    }

    public static int calculateAverageMark(int a, int b, int c, int d, int e) {

        int[] marks = {a, b, c, d, e};
        int sum = 0;
        for (int x : marks) {
            sum += x;
        }
                return sum / marks.length;
    }

}


