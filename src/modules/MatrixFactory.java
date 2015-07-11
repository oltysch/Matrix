package modules;

import java.util.Random;

/**
 * Created by Admin on 05.07.2015.
 */
public class MatrixFactory {

    //    Matrix factory
    public static Matrix create(int rows, int colls) {
        int[][] tmp = new int[rows][colls];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colls; j++) {
                tmp[i][j] = rand.nextInt(200);
            }
        }
        return new Matrix(tmp);
    }
}
