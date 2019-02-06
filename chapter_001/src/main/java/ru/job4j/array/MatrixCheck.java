package ru.job4j.array;

/**
 * Class MatrixCheck.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class MatrixCheck {
    /**
     * Method mono - compares diagonals.
     * @param data - array.
     * @return - return comparison result.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1] || data[i][data.length - 1 - i] != data[i + 1][data.length - 2 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
