package homework.homework10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrix {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Задай кількість рядків матриці:");
        int column = Integer.parseInt(READER.readLine());
        System.out.println("Задай кількість стовпців матриці:");
        int size = Integer.parseInt(READER.readLine());
        System.out.println("Заповни матрицю значеннями:");
        int[][] matrix = fillArray(column, size);
        int[][] transposedMatrix = new int[size][column];
        System.out.println("Твоя матриця");
        conclusion(matrix);
        System.out.println("Транспонована матриця");
        valueExchange(matrix, transposedMatrix);
    }

    public static int[][] fillArray(int column, int size) throws IOException {
        int[][] matrix = new int[column][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(READER.readLine());
            }
            System.out.println();
        }
        return matrix;
    }

    public static void conclusion(int[][] matrix) {
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
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
