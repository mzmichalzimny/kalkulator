package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        StringBuilder builder = new StringBuilder();
        for (Shape shape : shapes) {
            builder.append(shape.getShapeName()).append(", ");
        }
        return builder.toString();
    }

    public int getShapesSize() {
        return shapes.size();
    }
}