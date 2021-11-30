package ru.bfu.ipmit.lab3;

public class Triangle implements Shape {
    private double[] pointA = new double[2];
    private double[] pointB = new double[2];
    private double[] pointC = new double[2];

    Triangle() {
    }

    Triangle(double Ax, double Ay, double Bx, double By, double Cx, double Cy) {
        pointA[0] = Ax;
        pointA[1] = Ay;
        pointB[0] = Bx;
        pointB[1] = By;
        pointC[0] = Cx;
        pointC[1] = Cy;
    }

    @Override
    public double getArea() {
        //площадь треугольника через определитель второго порядка
        double mainMatrixDiagonal = (pointA[0] - pointC[0]) * (pointB[1] - pointC[1]);
        double secondaryMatrixDiagonal = (pointB[0] - pointC[0]) * (pointA[1] - pointC[1]);
        double matrixDeterminant = mainMatrixDiagonal - secondaryMatrixDiagonal;
        return 0.5 * Math.abs(matrixDeterminant);
    }

    private double triangleSideLength(double[] firstPoint, double[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2)
                + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    @Override
    public double getPerimeter() {
        double[] triangleSides = new double[3];
        triangleSides[0] = triangleSideLength(pointA, pointB);
        triangleSides[1] = triangleSideLength(pointA, pointC);
        triangleSides[2] = triangleSideLength(pointB, pointC);
        return triangleSides[0] + triangleSides[1] + triangleSides[2];
    }

    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }
}
