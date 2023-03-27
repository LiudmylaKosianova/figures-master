package com.epam.rd.autotasks.figures;
import static java.lang.Math.*;


class Circle extends Figure{
    Point center;
    double radius;

    public Circle(Point center, double radius ){
        this.center = center;
        this.radius = radius;
    }

    /**
     * @return the area of the figure
     */
    @Override
    public double area() {
        return pow(radius,2)*PI;
    }

    @Override
    public String pointsToString(){
        return "("+center.getX()+","+center.getY()+")";
    }

    @Override
    public String toString(){
        return "Circle ["+pointsToString()+radius+"]";
    }

    @Override
    public Point leftmostPoint(){
        double x = center.getX()-radius;
        double y = center.getY();
        return new Point(x,y);
    }
}
