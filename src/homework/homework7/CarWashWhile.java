package homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWashWhile {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Введіть кількість машин: ");
        String input = READER.readLine();
        int finished = 0;
        while (finished < Integer.parseInt(input)) {
            finished++;
            Thread.sleep(1000);
            System.out.println("Машина номер " + finished);
            System.out.println(toSoap("Намилили, ") + wash("помили, ") + dryUp("висушили. "));
        }
        System.out.println("Роботу виконано!!!");
    }

    public static String toSoap(String message) {
        return message;
    }

    public static String wash(String message) {
        return message;
    }

    public static String dryUp(String message) {
        return message;
    }
}

