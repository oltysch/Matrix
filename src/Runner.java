/**
 * Created by oltysch on 16.05.2015.
 * main class, wokrs with user inputs and returns replies
 */

import modules.Matrix;
import modules.MatrixFactory;

import java.util.Scanner;

import static modules.MatrixCalculations.multiplication;

public class Runner {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        useFactory();
    }

    //    uses only factory
    public static void useFactory() {
        int rows1 = 5;
        int colls1 = 7;
        int colls2 = 6;
        Matrix matrix1 = MatrixFactory.create(rows1, colls1);
        Matrix matrix2 = MatrixFactory.create(colls1, colls2);
        Matrix matrix3 = multiplication(matrix1, matrix2);
        System.out.println("Резельтат умножения: \n" + matrix1.getMatrixNormal() + "\n    *    \n" + matrix2.getMatrixNormal() + "\n    =    \n" + matrix3.getMatrixNormal());
    }

    //    uses console for rows and colls count and factory for create matrix
    public static void useFactoryAndConsole() {
        int rows1;
        int colls1;
        int colls2;
        System.out.print("Введите количество строк первой матрицы: ");
        rows1 = sc.nextInt();
        System.out.print("Введите количество столбцов первой матрицы: ");
        colls1 = sc.nextInt();
        System.out.println("Количество строк второй матрицы равно количеству строк первой.");
        System.out.print("Введите количество столбцов второй матрицы: ");
        colls2 = sc.nextInt();
        Matrix matrix1 = MatrixFactory.create(rows1, colls1);
        Matrix matrix2 = MatrixFactory.create(colls1, colls2);
        Matrix matrix3 = multiplication(matrix1, matrix2);
        System.out.println("Резельтат умножения: " + matrix1.getMatrixNormal() + " * " + matrix2.getMatrixNormal() + " = " + matrix3.getMatrixNormal());
    }

    //    console Matrix request and multiplication
    public static void useConsole() {
        System.out.println("Ввод первой матрицы");
        Matrix matrix1 = inputMatrix();
        System.out.println("Ввод второй матрицы");
        Matrix matrix2 = inputMatrix();
        Matrix matrix3 = multiplication(matrix1, matrix2);
        System.out.println("Резельтат умножения: " + matrix3.getMatrixNormal());
    }

    //    function of request the enter a Matrix (only in console)
    public static Matrix inputMatrix() {
        System.out.print("Введите количество строк матрицы: ");
        int rows = sc.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int colls = sc.nextInt();
        Matrix temp = new Matrix(rows, colls);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colls; j++) {
                System.out.print("Введите элемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                temp.setElement(i, j, sc.nextInt());
            }
        }
        return temp;
    }
}
