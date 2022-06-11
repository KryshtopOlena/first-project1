package homeworks.homework08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SplitArray {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введи 20 чисел для заповнення масиву");
        int size = 20;
        int[] bigArray = fillArray(size);

        int[] smallArray1 = Arrays.copyOfRange(bigArray, 0, bigArray.length / 2);
        int[] smallArray2 = Arrays.copyOfRange(bigArray, bigArray.length / 2, bigArray.length);

        System.out.println("Перша половина масиву " + Arrays.toString(smallArray1));
        System.out.println("Друга половина масиву " + Arrays.toString(smallArray2));
    }

    public static int[] fillArray(int size) throws IOException {
        int[] arrays = new int[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(READER.readLine());
        }
        return arrays;
    }
}
