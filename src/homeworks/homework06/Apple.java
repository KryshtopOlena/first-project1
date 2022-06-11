package homeworks.homework06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apple {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Скільки яблук зібрали внуки? ");
        int sumApples = Integer.parseInt(reader.readLine());

        int cupLarge = 5;
        int cupAverage = 3;

        int sumCupLarge = calculateCup(sumApples, cupLarge);
        System.out.println("Великих банок треба " + sumCupLarge);
        int remainder = calculateRemainder(sumApples, cupLarge);

        int sumCupAverage = calculateCup(remainder, cupAverage);
        System.out.println("Середніх банок треба " + sumCupAverage);

        int sumCupSmall = calculateRemainder(remainder, cupAverage);
        System.out.println("Маленьких банок треба " + sumCupSmall);

    }

    public static int calculateCup(int apples, int cups) {
        return apples / cups;
    }

    public static int calculateRemainder(int apples, int cups) {
        return apples % cups;
    }

}


