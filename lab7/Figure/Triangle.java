package com.company.Figure;

public class Triangle extends Figure {
    public Triangle(double a, double b, double c) {
        super.perimeter = a + b + c;

        double half = super.perimeter / 2;
        super.area = Math.sqrt(
                half * (half - a) * (half - b) * (half - c)
        );
    }

    @Override
    public double getArea() {
        return super.area;
    }

    @Override
    public double getPerimeter() {
        return super.perimeter;
    }
}
