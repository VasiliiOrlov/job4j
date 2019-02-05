package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasaliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class SquareTest {
    /**
     * Method whenBound3 - check array size = 3.
     */
    @Test
    public void whenBound3() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expect = {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Method whenBound4 - check array size = 4.
     */
    @Test
    public void whenBound4() {
        Square square = new Square();
        assertThat(square.calculate(4), is(new int[] {1, 4, 9, 16}));
    }
}
