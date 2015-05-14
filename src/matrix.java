import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввод первой матрицы");
        int[][] matrix1 = readM();
        System.out.println("Ввод второй матрицы");
        int[][] matrix2 = readM();
        if (matrix1[1].length !=matrix2.length) {
            System.out.println("Ошибка - число столбцов первой матрицы должно быть равно числу строк второй");
        } else {
            multiplication(matrix1, matrix2);
        }
    }

//    функция умножения матриц
    public static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        int h1 = matrix1.length;
        int w1 = matrix1[1].length;
        int h2 = matrix2.length;
        int w2 = matrix2[1].length;
        if (w1 != h2) {
            int[][] res = new int[][]{{0},{0}};
            return res;
        } else {
            int[][] res = new int[h1][w2];
            for (int i = 1; i < h1; i++) {
                for (int j = 1; j < w2; j++) {
                    res[i][j] = 0;
                    for (int k = 1; k < w1; k++) {
                        res[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            return res;
        }
    }

//    функция считывания матрицы
    public static int[][] readM() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int h = in.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int w = in.nextInt();
        int[][] matrix = new int[h][w];
        for (int i=1;i<h;i++) {
            for (int j=1;j<w;j++) {
                System.out.println("Введите элемент ["+i+"], ["+j+"]:");
                matrix[i][j]=in.nextInt();
            }
        }
        return matrix;
    }
}
