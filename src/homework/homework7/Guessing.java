package homework.homework7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guessing {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Вгадай число від 0 до 10 ");
        int numberData = (int) (Math.random() * 10);
        String input = READER.readLine();

        while (numberData != Integer.parseInt(input)) {
            System.out.println("Не вгадав. Спробуй ще ");
            input = READER.readLine();
        }

        System.out.println("Вітаю! Ти крутий! ");
    }

}
