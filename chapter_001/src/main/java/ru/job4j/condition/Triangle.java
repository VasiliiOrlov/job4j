package ru.job4j.condition;

/**
 * Class Triangle - calculates area triangle.
 * @author VasiliiOrlov.
 * @version $Id$.
 * @since 0.1.
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    /**
     * @param a - point a.
     * @param b - point b.
     * @param c - point c.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method period calculates the 1/2 perimeter.
     * @param ab - distance between point a and point b.
     * @param ac - distance between point a and point c.
     * @param bc - distance between point b and point c.
     * @return - 1/2 perimeter.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Method area calculates area
     * @return return area or -1.
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    /**
     * Method checks triangle.
     */
    private boolean exist(double ab, double ac, double bc) {
        return (this.period(ab, ac, bc) - ab) * (this.period(ab, ac, bc) - bc) * (this.period(ab, ac, bc) - ac) != 0;
    }
}
