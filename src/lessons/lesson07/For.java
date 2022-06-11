package lessons.lesson07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Enter data: ");
        String input = READER.readLine();
        while (!input.equals("stop")){
            System.out.println("your input " + input);
            input = READER.readLine();
        }

    }

}
