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
        String user = READER.readLine();
        user = user.replaceAll(" ", "");
        user = user.toLowerCase(Locale.ROOT);

        int size = user.length();
        char[] userString = user.toCharArray();
        char[] userStringCopy = Arrays.copyOfRange(userString, 0, size);

        overturning(size, userString);
        comparePalindrome(userString, userStringCopy);

    }

    public static char[] overturning(int size, char[] userString) {
        for (int i = 0; i < size / 2; i++) {
            char place = userString[i];
            userString[i] = userString[size - i - 1];
            userString[size - i - 1] = place;
        }
        return userString;
    }

    public static void comparePalindrome(char[] userString, char[] userStringCopy) {
        if(Arrays.equals(userString, userStringCopy)){
            System.out.println("Ця фраза являється паліндромною");
            return;
        }
        System.out.println("Ця фраза не являється паліндромною");
    }

}
