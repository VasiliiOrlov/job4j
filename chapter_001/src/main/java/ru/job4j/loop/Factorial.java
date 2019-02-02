package ru.job4j.loop;

/**
 * Class Factorial calculated factorial number >=0.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Factorial {
    /**
     * Method calc - calculated factorial number >=0.
     * @param n - factorial number.
     * @return factorial calculation result.
     */
    public int calc(int n) {
        int fac = 1;
        if (n > 0) {
            for (int x = 1; x <= n; x++) {
                fac = fac * x;
            }
        }
        return fac;
    }
}
