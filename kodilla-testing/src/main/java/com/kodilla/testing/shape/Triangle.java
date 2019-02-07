package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double triangleBase;
    private double triangleHeight;

    public Triangle(double triangleBase, double triangleHeight) {
        this.triangleBase = triangleBase;
        this.triangleHeight = triangleHeight;
    }

    public double getTriangleBase() {
        return triangleBase;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        return triangleBase * triangleHeight / 2;
    }

    @Override
    public String toString() {
        return "This is a " + this.getShapeName() + " with length of the base equals " +
                this.getTriangleBase() + ", the height equals " + this.getTriangleHeight() + ", and the area equals " + this.getField() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.triangleBase, triangleBase) == 0 &&
                Double.compare(triangle.triangleHeight, triangleHeight) == 0;
    }

}
