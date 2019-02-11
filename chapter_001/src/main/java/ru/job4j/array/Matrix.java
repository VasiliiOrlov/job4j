package ru.job4j.array;

/**
 * Class Matrix.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Matrix {
    /**
     * Method multiple - multiplication table.
     * @param size - size table.
     * @return - "array - table".
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                table[row][column] = (row + 1) * (column + 1);
            }
        }
        return table;
    }
}
