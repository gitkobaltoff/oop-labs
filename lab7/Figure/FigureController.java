package com.company.Figure;

import java.util.ArrayList;

public class FigureController {
    public Figure getBiggestPerimeter(ArrayList<Figure> figures) {
        if (figures.size() == 0) {
            return null;
        }

        Figure figure = figures.get(0);

        for (Figure value : figures) {
            if (value.getPerimeter() > figure.getPerimeter()) {
                figure = value;
            }
        }

        return figure;
    }

    public Figure getBiggestArea(ArrayList<Figure> figures) {
        if (figures.size() == 0) {
            return null;
        }

        Figure figure = figures.get(0);

        for (Figure value : figures) {
            if (value.getArea() > figure.getArea()) {
                figure = value;
            }
        }

        return figure;
    }
}
