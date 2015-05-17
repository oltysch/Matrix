import matrix.modules.matrix;

import java.util.Scanner;

/**
 * Created by Admin on 16.05.2015.
 */
public class matrixMultiplication {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String command = "";
        while (!((command.equals("нет")) || (command.equals("Нет")) || (command.equals("n"))
                || (command.equals("N")) || (command.equals("no")) || (command.equals("No")))) {
            System.out.println("Ввод первой матрицы");
            matrix matrix1 = enterMatrix();
            System.out.println("Ввод второй матрицы");
            matrix matrix2 = enterMatrix();
            matrix matrix3 = matrix1.multiplication(matrix2);
            System.out.println("Резельтат умножения: " + matrix3.getMatrix());
            System.out.println("Хотите продолжить? (Да/Нет): ");
            command = sc.next();
        }
    }

    //    функция запрашивает ввод матрицы
    public static matrix enterMatrix() {
        System.out.print("Введите количество строк матрицы: ");
        int rows = sc.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int colls = sc.nextInt();
        matrix temp = new matrix(rows, colls);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colls; j++) {
                System.out.print("Введите элемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                temp.setElement(i, j, sc.nextInt());
            }
        }
        return temp;
    }
}
