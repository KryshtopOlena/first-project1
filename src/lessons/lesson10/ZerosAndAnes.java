package lessons.lesson10;

public class ZerosAndAnes {
    public static void main(String[] args) {
        int column = 5;
        int size = 5;
        int[][] arr = new int[column][size];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();

        }
    }
}
