package homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWashFor {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Введіть кількість машин: ");
        String input = READER.readLine();

        for (int i = 0; Integer.parseInt(input) > i; i++) {
            Thread.sleep(1000);
            System.out.println("Машина номер " + (i + 1));
            Thread.sleep(1000);
            toSoap();
            Thread.sleep(1000);
            wash();
            Thread.sleep(1000);
            dryUp();
            Thread.sleep(1000);

        }
        System.out.println("Роботу виконано!!!");
    }

    public static void toSoap() {
        String process1 = "Намилили, ";
        System.out.println(process1);
    }

    public static void wash() {
        String process2 = "Помили, ";
        System.out.println(process2);

    }

    public static void dryUp() {
        String process3 = "Висушили.";
        System.out.println(process3);
    }

}
