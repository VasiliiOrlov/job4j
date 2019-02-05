package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class BubbleSoftTest {
    /**
     * Method checkSoft - check soft method.
     */

    @Test
    public void checkSoft() {
        BubbleSoft soft = new BubbleSoft();
        assertThat(soft.soft(new int[] {3, 6, 2, 4, 1, 10, 5, 9, 7, 8}), is(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
