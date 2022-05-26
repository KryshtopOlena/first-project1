package homework.homework8;

import java.util.Arrays;

public class Football {

    public static void main(String[] args) {
        int size = 11;
        int min = 18;
        int max = 45;

        int[] allAge1 = fillArray(size, max, min);
        System.out.println(Arrays.toString(allAge1));

        int[] allAge2 = fillArray(size, max, min);
        System.out.println(Arrays.toString(allAge2));

        compareAverage(calculateAverage(size,allAge1), calculateAverage(size,allAge2));

    }
    public static void compareAverage(double average1, double average2){
        if (average1 > average2){
            System.out.println("Середній вік гравців першої команди вищий.");
        } else if (average1 < average2){
            System.out.println("Середній вік гравців другої команди вищий.");
        } else {
            System.out.println("Середній вік обох команд рівний");
        }
    }

    public static double calculateAverage(int length, int[] array){
        double sum = 0;
        for (int i = 0; i < length; i++) {
                sum += array[i];
            }
        return sum / length;
    }

    public static int[] fillArray(int length, int max, int min) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * ((max - min) + 1) + min);
        }
        return array;
    }
}
