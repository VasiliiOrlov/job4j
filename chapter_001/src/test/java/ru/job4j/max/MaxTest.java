package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.2.
 */
public class MaxTest {
    /**
     * Method max - checks when the first number is greater.
     */
    @Test
    public void max() {
        Max max = new Max();
        assertThat(max.max(5, 8), is(8));
    }

    /**
     * Method max1 - checks when the second number is greater.
     */
    @Test
    public void max1() {
        Max max = new Max();
        assertThat(max.max(11, 8), is(11));
    }

    /**
     * Method maxOfThree - test maxOfThree.
     */
    @Test
    public void maxOfThree() {
      Max max = new Max();
      assertThat(max.maxOfThree(2, 8, 5), is(8));
    }
}
