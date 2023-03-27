package com.epam.rd.autotasks.figures;
import static java.lang.Math.*;


class Triangle extends Figure{

    Point a, b, c;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double aSide = sqrt( pow ((b.getX() - a.getX()),2) + pow( (b.getY() - a.getY()),2 ) );
        double bSide = sqrt( pow ((c.getX() - b.getX()),2) + pow( (c.getY() - b.getY()),2 ) );
        double cSide = sqrt( pow ((a.getX() - c.getX()),2) + pow( (a.getY() - c.getY()),2 ) );
        //double aSide = new Segment(this.a,this.b).length();
        //double bSide = new Segment(this.b,this.c).length();
        //double cSide = new Segment(this.c,this.a).length();

        double semiP = (aSide+bSide+cSide)/2;
        return sqrt(semiP* (semiP-aSide)*(semiP-bSide)*(semiP-cSide));
    }

    /**
     *
     * @return a String value in following formats:     *
     *         * Format: `(a.x,a.y)(b.x,b.y)(c.x,c.y)`
     *         * Example: `(0.0,0.0)(0.1,5.8)(7.0,7.0)`
     */
    @Override
    public String pointsToString() {
        return a.toString()+b.toString()+c.toString();
    }

    /**
     *
     * @return  a String value in following formats:
     *         * Format: `Triangle[(a.x,a.y)(b.x,b.y)(c.x,c.y)]`
     *         * Example: `Triangle[(0.0,0.0)(0.1,5.8)(7.0,7.0)]`
     */
    @Override
    public String toString() {
        return "Triangle ["+pointsToString()+"]";
    }

    @Override
    public Point leftmostPoint() {
        double leftmostX = min( min(a.getX(),b.getX()), min(a.getX(),c.getX()));
        double leftmostY = min( min(a.getY(),b.getY()), min(a.getY(),c.getY()));
        return new Point(leftmostX,leftmostY);
    }
}
