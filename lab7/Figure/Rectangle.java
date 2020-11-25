package com.company.Figure;

public class Rectangle extends Figure {
    public Rectangle(double length, double width) {
        super.perimeter = 2 * (length + width);
        super.area = length * width;
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