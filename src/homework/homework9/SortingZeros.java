package homework.homework9;

import java.util.Arrays;

public class SortingZeros {

    public static void main(String[] args) {
        byte size = 10;
        byte min = 0;
        byte max = 5;
        byte[] array = fillArray(size, min, max);
        sortArray(array);
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
            if (array[i] == 0) {
                byte sparePlace = array[i];
                array[i] = sparePlace;
            }
        }
        System.out.println();
    }
}
