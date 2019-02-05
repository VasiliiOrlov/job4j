package ru.job4j.array;

/**
 * Class Check.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Check {
    /**
     * Method mono - check condition.
     * @param data - array with condition.
     * @return - result comparisons.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}