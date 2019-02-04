package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint - created pyramid.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Paint {

    /**
     * Method pyramid - created pyramid.
     * @param height - height pyramid.
     * @return - return paint pyramid.
     */

    public  String rightTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );
    }

    /**
     * Method pyramid - created pyramid.
     * @param height - height pyramid.
     * @return - return paint pyramid.
     */
    public  String leftTrl(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
    }

    /**
     * Method pyramid - created pyramid.
     * @param height - height pyramid.
     * @return - return paint pyramid.
     */
    public  String pyramid(int height) {
        return this.loopBy(
                height,
                height * 2 - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
    }

    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
