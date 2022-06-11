package homeworks.homework09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Загадай 7 чисел від 0 до 9");
        int size = 7;
        int max = 9;
        int min = 0;

        int[] userNumbers = new int[size];
        fillUserArray(size, userNumbers, max, min);

        int[] companyNumbers = new int[size];
        fillCompanyArray(size, max, min, companyNumbers);

        sortArray(size, userNumbers);
        sortArray(size, companyNumbers);

        System.out.print("Відгадані числа ");
        System.out.println(sameNumbersInArrays(userNumbers, companyNumbers));

    }

    public static void fillUserArray(int size, int[] array, int max, int min) throws IOException {
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(READER.readLine());
            if (array[i] < min || array[i] > max){
                fillUserArray(size, array, max, min);
            }
        }
    }

    public static void fillCompanyArray(int size, int max, int min, int[] array) {
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * ((max - min) + 1) + min);
        }
    }

    public static void sortArray(int size, int[] array) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[j] > array[i]) {
                    int sparePlace = array[j];
                    array[j] = array[i];
                    array[i] = sparePlace;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static ArrayList<Integer> sameNumbersInArrays(int[] userNumbers, int[] companyNumbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int spare = 0;
        for (int i = 0; i < userNumbers.length; i++) {
            if (userNumbers[i] == companyNumbers[i]) {
                arr.add(userNumbers[i]);
                spare++;
            }
        }
        System.out.println(" (" + spare + ") ");
        return arr;
    }
}
