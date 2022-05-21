package lessons.lessons6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkoutMethods {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String test1 = reader.readLine();
        String test2 = reader.readLine();
        int number = 5;
        printMessage(test1, test2);
        printConcatenation(test1, number);

    }

    public static void printMessage(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void printConcatenation(String str, int number) {
        System.out.println(str + number);
    }

}
