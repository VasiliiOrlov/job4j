package ru.job4j.calculator;

/**
 * Fit - ideal weight calculation.
 * @author VasiliiOrlov.
 * @since 23.01.2019.
 */
public class Fit {
    /**
     * Method ideal weight men.
     * @param height height.
     * @return ideal weight.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Method ideal weight women.
     * @param height height.
     * @return ideal weight.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
