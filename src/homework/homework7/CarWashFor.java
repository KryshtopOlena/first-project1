package homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWashFor {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Введіть кількість машин: ");
        int input = Integer.parseInt(READER.readLine());

        for (int i = 1; input >= i; i++) {
            Thread.sleep(1000);
            System.out.println("Машина номер " + i);
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
        System.out.println("Намилили. ");
    }

    public static void wash() {
        System.out.println("Помили. ");

    }

    public static void dryUp() {
        System.out.println("Висушили.");
    }

}
