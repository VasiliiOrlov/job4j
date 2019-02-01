package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasiliiOrlov.
 * @version $Id$
 * @since 0.1.
 */
public class CounterTest {
    /**
     * Method summ - checking the sum of even numbers.
     */
    @Test
    public void summ() {
        Counter sum = new Counter();
        assertThat(sum.summa(1, 10), is(30));
    }
}
