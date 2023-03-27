package com.epam.rd.autotasks.figures;

import static java.lang.Math.min;

class Quadrilateral extends Figure {

    Point a, b, c, d;
    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double area() {
        Triangle one = new Triangle(a,b,c);
        Triangle two = new Triangle(a,c,d);
        return one.area()+two.area();
    }

    /**
     * @return
     *         * Format: `(a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)`
     *         * Example: `(0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)`
     */
    @Override
    public String pointsToString() {
        return a.toString()+b.toString()+c.toString()+d.toString();
    }

    /**
     * @return
     *         * Format: `Quadrilateral[(a.x,a.y)(b.x,b.y)(c.x,c.y)(d.x, d.y)]`
     *         * Example: `Quadrilateral[(0.0,0.0)(0.0,7.1)(7.0,7.0)(7.0,0.0)]`
     */
    @Override
    public String toString() {
        return "Quadrilateral ["+pointsToString()+"]";
    }

    @Override
    public Point leftmostPoint() {
        double leftmostX = min( min(a.getX(),b.getX()), min(c.getX(),d.getX()));
        double leftmostY = min( min(a.getY(),b.getY()), min(c.getY(),d.getY()));
        return new Point(leftmostX,leftmostY);
    }
}
