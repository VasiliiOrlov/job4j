package ru.job4j.condition;

/**
 * Point - point.
 * @author VasiliiOrlov.
 * @since 23.01.2019.
 */
public class Point {
    /**
     * Contains x coordinate.
     */
    private int x;
    /**
     * Contains y coordinate.
     */
    private int y;

    /**
     * Constructor.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @param that - that point.
     * @return distance point.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}
