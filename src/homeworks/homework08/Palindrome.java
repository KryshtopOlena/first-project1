package homeworks.homework08;

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

        overturning(userString);
        String message = isPalindrome(userString, userStringCopy) ? "Це паліндром" : "Це не паліндром";
        System.out.println(message);
    }

    public static void overturning(char[] userString) {
        for (int i = 0; i < userString.length / 2; i++) {
            char place = userString[i];
            userString[i] = userString[userString.length - i - 1];
            userString[userString.length - i - 1] = place;
        }

    }

    public static boolean isPalindrome(char[] userString, char[] userStringCopy) {
        if (!Arrays.equals(userString, userStringCopy)) {
            return false;
        }
        return  true;
    }

}
