package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double sideA;

    public Square(String shapeName, double sideA) {
        this.shapeName = shapeName;
        this.sideA = sideA;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        double fieldSquare = Math.pow(sideA, 2);
        return fieldSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideA, sideA) != 0) return false;
        return shapeName != null ? shapeName.equals(square.shapeName) : square.shapeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
