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
public class ArrayCharTest {
    /**
     * Method check startWith.
     */
    @Test
    public void whenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hel");
        assertThat(result, is(true));
    }
    /**
     * Method check startWith.
     */
    @Test
    public void whenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Heg");
        assertThat(result, is(false));
    }
}
