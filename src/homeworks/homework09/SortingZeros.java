package homeworks.homework09;

import java.util.Arrays;

public class SortingZeros {

    public static void main(String[] args) {
        byte size = 10;
        byte min = -2;
        byte max = 3;
        byte[] array = fillArray(size, min, max);
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static byte[] fillArray(byte size, byte min, byte max) {
        byte[] array = new byte[size];
        for (byte i = 0; i < size; i++) {
            array[i] = (byte) (Math.random() * ((max - min) + 1) + min);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void sortArray(byte[] array) {
        for (byte i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                byte sparePlace;
                if (array[j] == 0) {
                    sparePlace = array[j];
                    array[j] = array[i];
                    array[i] = sparePlace;
                }
            }
        }
    }
}
