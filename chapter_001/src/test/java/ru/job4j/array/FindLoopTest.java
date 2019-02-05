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
public class FindLoopTest {
    /**
     * Method CheckFindLoop11 - check work indexOf.
     */
    @Test
    public void checkFindLoop11() {
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(new int[] {5, 10, 3}, 11), is(-1));
    }

    /**
     * Method CheckFindLoop10 - check work indexOf.
     */
    @Test
    public void checkFindLoop10() {
        FindLoop find = new FindLoop();
        assertThat(find.indexOf(new int[] {5, 10, 3}, 10), is(1));
    }
}
