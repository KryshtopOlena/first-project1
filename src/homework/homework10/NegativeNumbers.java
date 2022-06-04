package homework.homework10;

public class NegativeNumbers {

    public static void main(String[] args) {
        int column = 2;
        int size = 3;

        int[][] arr = fillArray(column, size);
        chooseNegativeNumbers(arr);
    }

    public static int[][] fillArray(int column, int size) {
        int max = 15;
        int min = -15;
        int[][] arr = new int[column][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
            }
            System.out.println();
        }
        return arr;
    }

    public static void chooseNegativeNumbers(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                    continue;
                }
                System.out.print(arr[i][j] + " ");
                System.out.println("(index =  " + i + "" + j + ")");
            }
            System.out.println();
        }
    }

}
