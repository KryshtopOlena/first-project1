package homeworks.homework10;

public class NegativeNumbers {

    public static void main(String[] args) {
        int columns = 2;
        int rows = 3;

        int[][] arr = createAndFillArray(columns, rows);
        chooseNegativeNumbers(arr);
    }

    public static int[][] createAndFillArray(int columns, int rows) {
        int max = 15;
        int min = -15;
        int[][] arr = new int[columns][rows];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
            }
        }
        return arr;
    }

    public static void chooseNegativeNumbers(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] >= 0) {
                    continue;
                }
                System.out.println(arr[i][j] + " " + "(index =  " + i + "" + j + ")");
            }
        }
    }
}
