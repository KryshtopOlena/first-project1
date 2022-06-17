package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Displacement {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Введи число на скільки значень зсувати масив:");
        int input = Integer.parseInt(READER.readLine());
        int size = 10;
        int[] arr = fillAndPrintArray(size);
        System.out.println(Arrays.toString(arr));

        displaceArrayRight(arr, input);
        displaceArrayLeft(arr, input);
    }

    public static int[] fillAndPrintArray(int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 10);
        return arr;
    }

    public static void displaceArrayRight(int[] arr,  int input) {
        for (int i = 0; i < arr.length + input; i++) {
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                int sparePlace;
                sparePlace = arr[j];
                arr[j] = arr[index];
                arr[index] = sparePlace;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void displaceArrayLeft (int[] array, int input){
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < array.length; j++) {
                int sparePlace;
                int index = 0;
                sparePlace = array[j];
                array[j] = array[index];
                array[index] = sparePlace;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
