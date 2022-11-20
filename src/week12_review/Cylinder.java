package week12_review;

import static java.lang.Math.*;

public class Cylinder extends Shape  implements Volume{

    private double height, radius;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calc_area() {
        return 2 * PI * radius * height + (2 * PI * pow(radius, 2));
    }

    @Override
    public double calc_perimeter() {
        return (2 * radius) + (2 * height);
    }

    public double calc_volume(){
        return 0;
    }


}
