package modules;

import java.util.Random;

/**
 * Created by oltysch on 16.05.2015.
 * Add a class of "Matrix", and his methods.
 */

public class Matrix {
    private int[][] values;

    //    matrix initialization
    public Matrix(int[][] values) {
        this.values = values;
    }

    //    function returns values of Matrix in one String
    public String getMatrixInline() {
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

    //    returns matrix values in rows and colls view
    public String getMatrixNormal() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[1].length; j++) {
                result.append(values[i][j]);
                if (j + 1 < values[1].length) result.append(" ");
            }
            if (i + 1 < values.length) result.append("\n");
        }
        return result.toString();
    }

    public Matrix(int rows, int colls) {
        this.values = new int[rows][colls];
    }

    public void setMatrix(int[][] values) {
        this.values = values;
    }

    //    function assigns the single element of the Matrix
    public void setElement(int rows, int colls, int value) {
        this.values[rows][colls] = value;
    }

    public int getRows() {
        return values.length;
    }

    public int getValue(int row, int coll) {
        return values[row][coll];
    }

    public int getColls() {
        return values[0].length;

    }
}
