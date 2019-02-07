package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        return squareSide * squareSide;
    }

    @Override
    public String toString() {
        return "This is a " + this.getShapeName() + " with length of the side equals " +
                this.getSquareSide() + " and the area equals " + this.getField() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.squareSide, squareSide) == 0;
    }
}
