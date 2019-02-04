package ru.job4j.loop;

import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Test
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class PaintTest {
    /**
     * Method whenPyramid2 - check point pyramid height = 2.
     */

    @Test
    public void whenPyramid2() {
        Paint paint = new Paint();
        String rst = paint.pyramid(2);
        System.out.println(rst);
        assertThat(rst, is(new
                        StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add(" ^ ")
                        .add("^^^")
                        .toString()
                )
        );
    }

    /**
     * Method whenPyramid3 - check point pyramid height = 3.
     */
    @Test
    public void whenPyramid3() {
        Paint paint = new Paint();
        String rst = paint.pyramid(3);
        System.out.println(rst);
        assertThat(rst, is(new
                        StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add("  ^  ")
                        .add(" ^^^ ")
                        .add("^^^^^")
                        .toString()
                )
        );
    }
}
