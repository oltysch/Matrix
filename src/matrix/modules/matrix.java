package matrix.modules;

public class matrix {
    int[][] values;

    //    функция умножения матриц
    public matrix multiplication(matrix matrix2) {
        int h1 = this.values.length;
        int w1 = this.values[0].length;
        int h2 = matrix2.values.length;
        int w2 = matrix2.values[0].length;
        matrix mtrx;
        int[][] res;
        if (w1 != h2) {
            res = new int[][]{{0}, {0}};
            mtrx = new matrix(res);
            return mtrx;
        } else {
            res = new int[h1][w2];
            for (int i = 0; i < h1; i++) {
                for (int j = 0; j < w2; j++) {
                    res[i][j] = 0;
                    for (int k = 0; k < w1; k++) {
                        res[i][j] += this.values[i][k] * matrix2.values[k][j];
                    }
                }
            }
            mtrx = new matrix(res);
            return mtrx;
        }
    }

    //    функции инициализации матрицы
    public matrix(int[][] values) {
        this.values = values;
    }

    public void setMatrix(int[][] values) {
        this.values = values;
    }

    public matrix(int rows, int colls) {
        this.values = new int[rows][colls];
    }

    public void setMatrixSize(int rows, int colls) {
        this.values = new int[rows][colls];
    }

    //    функция задает отдельное значение матрциы
    public void setElement(int rows, int colls, int value) {
        this.values[rows][colls] = value;
    }

    //    функция возвращает значение матрицы строкой
    public String getMatrix() {
        String result = "[";
        for (int i = 0; i < values.length; i++) {
            result += "[";
            for (int j = 0; j < values[1].length; j++) {
                result += values[i][j];
                if (j + 1 < values[1].length) result += ", ";
            }
            result += "]";
            if (i + 1 < values.length) result += ", ";
        }
        result += "]";
        return result;
    }

}
