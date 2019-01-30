package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author VasiliiOrlov.
 * @since 31.01.2019.
 */
public class PointTest {
    /**
     * Test distanceTo.
     */
    @Test
    public void distanceTo() {
        Point point = new Point(0, 1);
        Point point1 = new Point(2, 5);
        double distance = point.distanceTo(point1);
        assertThat(distance, closeTo(4.47, 0.003));
    }
}
