package ru.job4j.max;

/**
 * Class Max - chooses a maximum of two numbers.
 * @author VasiliiOrlov.
 * @version $Id$
 * @since 0.1.
 */
public class Max {
    /**
     *
     * @param first - first number.
     * @param second - second number.
     * @return - return greater number.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}
