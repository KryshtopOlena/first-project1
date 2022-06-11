package lessons.lesson09;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {5, 0, 2, 4, 7, 10, 20};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int place = array[j];
                    array[j] = array[i];
                    array[i] = place;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}