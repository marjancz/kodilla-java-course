package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private double heightH;
    private double basisA;

    public Triangle(String shapeName, double heightH, double basisA) {
        this.shapeName = shapeName;
        this.heightH = heightH;
        this.basisA = basisA;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getHeightH() {
        return heightH;
    }

    public double getBasisA() {
        return basisA;
    }

    public double getField() {
        return 100.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.heightH, heightH) != 0) return false;
        if (Double.compare(triangle.basisA, basisA) != 0) return false;
        return shapeName != null ? shapeName.equals(triangle.shapeName) : triangle.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(heightH);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(basisA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
