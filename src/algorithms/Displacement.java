package algorithms;

import java.util.Arrays;

public class Displacement {

    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length + 2 ; i++) {
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
}
