package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private double radiusR;

    public Circle(String shapeName, double radiusR) {
        this.shapeName = shapeName;
        this.radiusR = radiusR;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getRadiusR() {
        return radiusR;
    }
    public double getField() {
        double fieldCircle = Math.PI * Math.pow(radiusR, 2);
        return fieldCircle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radiusR, radiusR) != 0) return false;
        return shapeName != null ? shapeName.equals(circle.shapeName) : circle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(radiusR);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}