package algorithms;

import java.util.Arrays;

public class Wix {
    public static void main(String[] args) {
        int size = 20;
        int min = 0;
        int max = size;
        int[] arr = fillAndPrintArray(size, 0, size);
        sortArray(arr);
        searchSum(arr);
    }

    public static int[] fillAndPrintArray(int max, int min, int size){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (max - min) + min);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] sortArray(int[] array) {
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
        return array;
    }

    public static void searchSum(int[] arr){
        int temp = 11;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] > temp) continue;
                else if (arr[i] + arr[j] == temp){
                    System.out.println(arr[i] + " (index " + i + ") + " + arr[j] + " (index " + j + ") = " + temp);

                }
                count++;
            }
        }
        System.out.println(count);
    }
}
