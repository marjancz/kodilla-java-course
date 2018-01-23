package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes;

    public ShapeCollector() {
        shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures() {
        String result;
        for (Shape s : shapes) {
            result = s.getShapeName();
            //System.out.println(s.getShapeName());
        }
    }

    public int getShapesQuantity() {
        return shapes.size();
    }
}
