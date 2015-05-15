import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String com = "";
        while (!((com.equals("нет")) || (com.equals("Нет")) || (com.equals("n")))) {
            System.out.println("Ввод первой матрицы");
            int[][] matrix1 = readM();
            System.out.println("Ввод второй матрицы");
            int[][] matrix2 = readM();
            if (matrix1[1].length != matrix2.length) {
                System.out.println("Ошибка - число столбцов первой матрицы должно быть равно числу строк второй");
            } else {
                int[][] result = multiplication(matrix1, matrix2);
                System.out.print("Результат умножения матриц: [");
                for (int i = 0; i < result.length; i++) {
                    System.out.print("[");
                    for (int j = 0; j < result[1].length; j++) {
                        System.out.print(result[i][j]);
                        if (j + 1 < result[1].length) System.out.print(", ");
                    }
                    System.out.print("]");
                    if (i + 1 < result.length) System.out.print(", ");
                }
                System.out.println("]");
            }
            System.out.println("Хотите продолжить? (Да/Нет): ");
            com = reader.readLine();
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
            for (int i = 0; i < h1; i++) {
                for (int j = 0; j < w2; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < w1; k++) {
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
        for (int i=0;i<h;i++) {
            for (int j=0;j<w;j++) {
                System.out.print("Введите элемент [" + (i+1) + "], [" + (j+1) + "]: ");
                matrix[i][j]=in.nextInt();
            }
        }
        return matrix;
    }
}
