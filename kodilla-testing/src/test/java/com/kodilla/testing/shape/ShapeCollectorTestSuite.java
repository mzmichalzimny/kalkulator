package com.kodilla.testing.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeCollectorTest {

    private ShapeCollector shapeCollector;
    private Shape square;
    private Shape circle;
    private Shape triangle;

    @BeforeEach
    void setUp() {
        shapeCollector = new ShapeCollector();
        square = new Square(111.0);
        circle = new Circle(222.0);
        triangle = new Triangle(333.0, 333.0);
    }

    @Nested
    @DisplayName("Tests for adding figures")
    class AddFigureTests {

        @Test
        @DisplayName("Add a square")
        void testAddSquare() {
            shapeCollector.addFigure(square);
            assertEquals(1, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Add a circle")
        void testAddCircle() {
            shapeCollector.addFigure(circle);
            assertEquals(1, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Add a triangle")
        void testAddTriangle() {
            shapeCollector.addFigure(triangle);
            assertEquals(1, shapeCollector.getShapesSize());
        }
    }

    @Nested
    @DisplayName("Tests for removing figures")
    class RemoveFigureTests {

        @Test
        @DisplayName("Remove a square")
        void testRemoveSquare() {
            shapeCollector.addFigure(square);
            shapeCollector.removeFigure(square);
            assertEquals(0, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Remove a circle")
        void testRemoveCircle() {
            shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(circle);
            assertEquals(0, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Remove a triangle")
        void testRemoveTriangle() {
            shapeCollector.addFigure(triangle);
            shapeCollector.removeFigure(triangle);
            assertEquals(0, shapeCollector.getShapesSize());
        }
    }

    @Nested
    @DisplayName("Tests for getting figures")
    class GetFigureTests {

        @Test
        @DisplayName("Get a square")
        void testGetSquare() {
            shapeCollector.addFigure(square);
            assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Get a circle")
        void testGetCircle() {
            shapeCollector.addFigure(circle);
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Get a triangle")
        void testGetTriangle() {
            shapeCollector.addFigure(triangle);
            assertEquals(triangle, shapeCollector.getFigure(0));
        }
    }

    @Test
    @DisplayName("Show all figures")
    void testShowFigures() {
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        assertEquals("Square, Circle, Triangle, ", shapeCollector.showFigures());
    }
}