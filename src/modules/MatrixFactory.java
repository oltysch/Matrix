package modules;

import java.util.Random;

public class MatrixFactory {

    //        Matrix factory
    public static Matrix create(int rows, int colls) {
//        creates new array
        int[][] tmp = new int[rows][colls];
//        adds values in this array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colls; j++) {
                tmp[i][j] = (int) (Math.random() * 200);
            }
        }
        return new Matrix(tmp);
    }
}
