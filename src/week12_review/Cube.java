package week12_review;

import static java.lang.Math.*;

public class Cube extends Shape implements Volume {

    private double side;

    public Cube( double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calc_area() {
        return 0;
    }

    @Override
    public double calc_perimeter() {
        return 0;
    }


    @Override
    public double calc_volume() {
        return 0;
    }

}
