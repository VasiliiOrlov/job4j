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

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Distance between point A and B : " + result);
    }
}
