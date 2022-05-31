package lessons.lessons9;

import java.util.Arrays;

public class CoachArray {

    public static void main(String[] args) {
        int[] array = new int[10];
        int length = 0;

        for (int i = 0; i < 5; i++) {
            array[i] = i * i;
            length++;
        }
        System.out.println(array.length);
        System.out.println(length);
        System.out.println(Arrays.toString(array));

    }
}
