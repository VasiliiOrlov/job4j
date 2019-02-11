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
        for (int index = 0; index < data.length - 1; index++) {
            if (data[index] == data[index + 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}