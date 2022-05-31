package homework.homework10;

public class NegativeNumbers {
    public static void main(String[] args) {
        int column = 2;
        int size = 3;
        int[][] arr = new int [column][size];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
              arr[i][j] = j;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
