package ru.job4j.converter;
/**
 * Class Converter - money converter .
 * @author VasiliiOrlov
 * @version $Id$
 * @since 23.01.2019
 */
public class Converter {
    /**
     * Method rubToEuro.
     * @param value - value rub.
     * @return value euro.
     */
    public int rubToEuro(int value) {
        return value / 70;
    }

    /**
     * Method rubToDollar.
     * @param value - value rub.
     * @return value dollar.
     */
    public int rubToDollar(int value) {
        return value / 60;
    }

    /**
     * Method euroToRub.
     * @param value - value euro.
     * @return value rub.
     */
    public int euroToRub(int value) {
        return value * 70;
    }

    /**
     * Method dollarToRub.
     * @param value - value rub
     * @return value rub
     */
    public int dollarToRub(int value) {
        return value * 60;
    }
}