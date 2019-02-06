package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */

public class MatrixTest {
    /**
     * Method checkMatrix2 - check method multiple with value = 2.
     */
    @Test
    public void checkMatrix2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}
