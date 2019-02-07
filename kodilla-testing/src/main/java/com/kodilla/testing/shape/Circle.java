package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        return circleRadius * circleRadius * Math.PI;
    }

    @Override
    public String toString() {
        return "This is a " + this.getShapeName() + " with length of the radius equals " +
                this.getCircleRadius() + " and the area equals " + this.getField() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.circleRadius, circleRadius) == 0;
    }
}
