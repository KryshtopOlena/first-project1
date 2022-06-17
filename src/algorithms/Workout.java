package algorithms;

import java.util.Arrays;

public class Workout {
    public static void main(String[] args) {
        int size = 10;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int spare;
        spare = arr[0];
        arr[0] = arr[8];
        arr[8] = arr[6];
        arr[6] = arr[4];
        arr[4] = arr[2];
        arr[2] = spare;
        spare = arr[1];
        arr[1] = arr[9];
        arr[9] = arr[7];
        arr[7] = arr[5];
        arr[5] = arr[3];
        arr[3] = spare;

        System.out.println(Arrays.toString(arr));
    }
}
