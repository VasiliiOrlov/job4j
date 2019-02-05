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
public class TurnTest {

    /**
     * Method checkTurn4 - check back method for length array = 4.
     */
    @Test
    public void checkTurn4() {
        Turn turn = new Turn();
        assertThat(turn.back(new int[] {1, 2, 3, 4}), is(new int[] {4, 3, 2, 1}));
    }

    /**
     * Method checkTurn4 - check back method for length array = 4.
     */
    @Test
    public void checkTurn5() {
        Turn turn = new Turn();
        assertThat(turn.back(new int[] {1, 2, 3, 4, 5}), is(new int[] {5, 4, 3, 2, 1}));
    }
}
