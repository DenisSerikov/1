import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.print("введите кол-во строк: ");
        int rows = vvod.nextInt();
        System.out.print("введите кол-во столбцов: ");
        int columns = vvod.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = vvod.nextInt();
            }
        }
        int[][] transMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}