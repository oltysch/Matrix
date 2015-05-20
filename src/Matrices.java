/**
 * Created by oltysch on 16.05.2015.
 * main class, wokrs with user inputs and returns replies
 */

import matrix.modules.Matrix;

import java.util.Scanner;

import static matrix.modules.MatrixCalculations.multiplication;

public class Matrices {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String command = "";
        while (!((command.equals("нет")) || (command.equals("Нет")) || (command.equals("n"))
                || (command.equals("N")) || (command.equals("no")) || (command.equals("No")))) {
            useMatrixFactory();
            System.out.println("Хотите продолжить? (Да/Нет): ");
            command = sc.next();
        }
    }

    public static void useMatrixFactory() {
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
        Matrix matrix1 = Matrix.create(rows1, colls1);
        Matrix matrix2 = Matrix.create(colls1, colls2);
        Matrix matrix3 = multiplication(matrix1, matrix2);
        System.out.println("Резельтат умножения: " + matrix1.getMatrixString() + " * " + matrix2.getMatrixString() + " = " + matrix3.getMatrixString());
    }

    //    console matrix request and multiplication
    public static void consoleMatrixEnter() {
        System.out.println("Ввод первой матрицы");
        Matrix matrix1 = inputMatrix();
        System.out.println("Ввод второй матрицы");
        Matrix matrix2 = inputMatrix();
        Matrix matrix3 = multiplication(matrix1, matrix2);
        System.out.println("Резельтат умножения: " + matrix3.getMatrixString());
    }

    //    function of request the enter a matrix (in a console)
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
