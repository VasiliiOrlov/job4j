package ru.job4j.loop;

/**
 * Class Counter - counter even numbers.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Counter {
    /**
     * Method summa calculated sum of even numbers.
     * @param start - first number.
     * @param finish - last number.
     * @return sum of numbers.
     */
    public int summa(int start, int finish) {
        int g = 0;
        for (; start <= finish; start++) {
            if (start % 2 != 0) {
                continue;
            }
            g = g + start;
        }
        return g;
    }
}
