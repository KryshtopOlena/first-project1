package homework.homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class Palindrome {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введіть фразу");
        String userWriting = READER.readLine();
        userWriting = userWriting.replaceAll(" ", "");
        userWriting = userWriting.toLowerCase(Locale.ROOT);

        int size = userWriting.length();
        char[] userString = userWriting.toCharArray();
        char[] userStringCopy = Arrays.copyOfRange(userString, 0, size);

        overturning(size, userString);
        comparePalindrome(userString, userStringCopy);

    }

    public static void overturning(int size, char[] userString) {
        for (int i = 0; i < size / 2; i++) {
            char place = userString[i];
            userString[i] = userString[size - i - 1];
            userString[size - i - 1] = place;
        }

    }

    public static void comparePalindrome(char[] userString, char[] userStringCopy) {
        if (Arrays.equals(userString, userStringCopy)) {
            System.out.println("Це паліндром");
            return;
        }
        System.out.println("Це не паліндром");
    }

}
