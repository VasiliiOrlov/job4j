package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 * @author VasiliiOrlov
 * @version $Id$
 * @since 0.1.
 */
public class FactorialTest {
    /**
     * Method calcOfFive - check the factorial of five.
     */
    @Test
    public void calcOfFive() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(5), is(120));
    }

    /**
     * Method calcOfFive - check the factorial of zero.
     */
    @Test
    public void calcOfZero() {
        Factorial factorial = new Factorial();
        assertThat(factorial.calc(0), is(1));
    }
}
