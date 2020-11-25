package com.company.Figure;

public class Square extends Figure {
    public Square(double size) {
        super.perimeter = 4 * size;
        super.area = size * size;
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
