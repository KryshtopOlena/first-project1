package homework.homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SplitArray {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = 20;
        int[] bigArray = new int[size];
        System.out.println("Введи 20 чисел для заповнення масиву");
        fillBigArray(size, bigArray);

        int[] smallArray1 = Arrays.copyOfRange(bigArray, 0, bigArray.length / 2);
        int[] smallArray2 = Arrays.copyOfRange(bigArray, size / 2, bigArray.length);

        System.out.println("Перша половина масиву " + Arrays.toString(smallArray1));
        System.out.println("Друга половина масиву " + Arrays.toString(smallArray2));
    }

    public static void fillBigArray(int size, int[] bigArray) throws IOException {
        for (int i = 0; i < size; i++) {
            bigArray[i] = Integer.parseInt(READER.readLine());
        }

    }

}
