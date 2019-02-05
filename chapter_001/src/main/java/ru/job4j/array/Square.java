package ru.job4j.array;

/**
 * Class Square.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Square {
    /**
     * Method calculate - created array
     * @param bound -  size array.
     * @return - array with values.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
        }
        return rst;
    }
}
