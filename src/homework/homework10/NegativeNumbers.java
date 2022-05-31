package homework.homework10;

import java.util.Arrays;

public class NegativeNumbers {
    public static void main(String[] args) {
        int column = 2;
        int size = 3;
        int max = 15;
        int min = -15;
        int[][] arr = new int[column][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
                if (arr[i][j] >= 0) {
                    continue;
                }
                System.out.print(Arrays.toString(new int[]{arr[i][j]}));
            }
            System.out.println();
        }

    }
}
