package ru.job4j.calculate;
/**
 * Class Calculator - elementary calculator.
 *
 * @author VasiliiOrlov
 * @version $Id$
 * @since 23.01.2019
 */
public class Calculator {
    /**
     * Section (pole) result.
     */
    double result;

    /**
     * Method add.
     * @param first First number.
     * @param second Second number.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtract.
     * @param first First number.
     * @param second Second number.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method div.
     * @param first First number.
     * @param second Second number.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiple.
     * @param first First number.
     * @param second Second number.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method getResult.
     * @return result.
     */
    public double getResult() {
        return this.result;
    }
}
