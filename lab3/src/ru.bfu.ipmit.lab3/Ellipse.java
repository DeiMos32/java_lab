package ru.bfu.ipmit.lab3;

public class Ellipse implements Shape {
    protected double[] centreOfEllipse = new double[2];
    protected double semi_major_axis, semi_minor_axis; //большая и малая полуоси соответственно

    Ellipse() {
    }

    Ellipse(double centreOfEllipseX, double centreOfEllipseY, double semi_major_axis, double semi_minor_axis) {
        centreOfEllipse[0] = centreOfEllipseX;
        centreOfEllipse[1] = centreOfEllipseY;
        this.semi_major_axis = semi_major_axis;
        this.semi_minor_axis = semi_minor_axis;
    }

    @Override
    public double getArea() {
        return Math.PI * semi_major_axis * semi_minor_axis;
    }

    @Override
    public double getPerimeter() {
        return 4 * ((getArea() + (semi_major_axis - semi_minor_axis)) / (semi_major_axis + semi_minor_axis));
    }

    @Override
    public ShapeType getType() {
        return ShapeType.ELLIPSE;
    }
}
