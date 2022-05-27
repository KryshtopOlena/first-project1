package lessons.lessons9;

import java.util.Arrays;

public class SortingZeros {

    public static void main(String[] args) {
        byte size = 10;
        byte min = 0;
        byte max = 5;
        byte[] array = new byte[size];
        fillArray(size, min, max, array);
        sortArray(size, array);
    }

    public static void fillArray(byte size, byte min, byte max, byte[] array) {
        for (byte i = 0; i < size; i++) {
            array[i] = (byte) (Math.random() * ((max - min) + 1) + min);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(byte size, byte[] array) {
        for (byte i = 0; i < size; i++) {
            for (byte j = 0; j < size; j++) {
                if (array[j] > array[i]) {
                    byte sparePlace = array[j];
                    array[j] = array[i];
                    array[i] = sparePlace;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
