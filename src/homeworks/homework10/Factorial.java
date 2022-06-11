package homeworks.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Set a number:");
        int number = Integer.parseInt(READER.readLine());
        System.out.println(getFactorial(number));

    }

    static int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }

}
