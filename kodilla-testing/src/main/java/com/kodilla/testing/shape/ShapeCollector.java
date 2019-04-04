package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if(figures.size() == 0) return false;
        else {
            figures.remove(shape);
        }
        return true;
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public String showFigures() {
        String listOfFigures = "";
        for(Shape figure : figures) {
            listOfFigures += figure.toString() + "\n";
        }
        return listOfFigures;
    }

    public int getFiguresQuantity() {
        return figures.size();
    }
}
