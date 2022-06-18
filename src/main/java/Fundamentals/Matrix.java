package Fundamentals;

/**
 * A program works with matrix
 *
 * @ author Pavel Rudzko
 */
import java.util.Random;
import java.util.Scanner;
public class Matrix {  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Введите границы чисел  ");
    int boundOfDigits = input.nextInt();

    System.out.println("Введите размер матрицы  ");

    int size = input.nextInt();
    int[][] array = new int[size][size];
    int[][] matrix_res = new int[size - 1][size - 1];


    java.util.Random random = new Random();
    for (int i = 0; i < size; i++)
        for (int j = 0; j < size; j++)
            array[i][j] = random.nextInt(boundOfDigits * 2) - boundOfDigits;

    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++)
            System.out.format("%4d", array[i][j]);
        System.out.println();
    }

    int max = 0;
    int rowIndexMax = 0;
    int colIndexMax = 0;

    int new_row = 0;
    int new_col = 0;


    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if (max < array[i][j]) {
                max = array[i][j];

                rowIndexMax = i;
                colIndexMax = j;
            }
        }
    }


    System.out.println("Максимальный элемент двумерного массива " + max);

    System.out.println(" индексы макс элемента  " + rowIndexMax + "  " + colIndexMax);


    int k;
    int m = 0;

    for (k = 0; k < array.length; k++) {
        for (m = 0; m < array.length; m++) {
            // if (array[rowIndexMax][colIndexMax] == array[k][m]) {
            if (max == array[k][m]) {
                System.out.println("индексы повтора " + max + " " + k + " " + m);
            }

        }

    }
    System.out.println("просто число из массива  " + array[1][1]);


    for (int i = 0; i < size; i++) {
        if (i != rowIndexMax) {

            for (int j = 0; j < size; j++) {
                if (j != colIndexMax) {

                    System.out.format("%4d", array[i][j]);
                    matrix_res[new_row][new_col] = array[i][j];
                    new_col++;
                }

            }
            new_col = 0;
            new_row++;
            System.out.println();
        }
    }


    for (int i = 0; i < matrix_res.length; i++) {

        for (int j = 0; j < matrix_res[i].length; j++) {


        }

    }

}
}
