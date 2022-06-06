package homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Задай кількість рядків матриці:");
        int columns = Integer.parseInt(READER.readLine());
        System.out.println("Задай кількість стовпців матриці:");
        int rows = Integer.parseInt(READER.readLine());
        System.out.println("Заповни матрицю значеннями:");
        int[][] matrix = createAndFillArray(columns, rows);
        int[][] transposedMatrix = new int[rows][columns];
        System.out.println("Твоя матриця");
        print(matrix);
        valueExchange(matrix, transposedMatrix);
        System.out.println("Транспонована матриця");
        print(transposedMatrix);
    }

    public static int[][] createAndFillArray(int columns, int rows) throws IOException {
        int[][] matrix = new int[columns][rows];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(READER.readLine());
            }
            System.out.println();
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void valueExchange(int[][] matrix, int[][] transposedMatrix) {

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
    }
}
