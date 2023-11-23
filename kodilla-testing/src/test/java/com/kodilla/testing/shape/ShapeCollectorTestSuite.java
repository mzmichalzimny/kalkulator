package com.kodilla.testing.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeCollectorTest {


    @Nested
    @DisplayName("Tests for adding figures")
    class AddFigureTests {

        @Test
        @DisplayName("Add a square")
        void testAddSquare() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5);
            // when
            shapeCollector.addFigure(square);
            // then
            assertEquals(1, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Add a circle")
        void testAddCircle() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5);
            // when
            shapeCollector.addFigure(circle);
            // then
            assertEquals(1, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Add a triangle")
        void testAddTriangle() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle (5, 2);
            // when
            shapeCollector.addFigure(triangle);
            // then
            assertEquals(1, shapeCollector.getShapesSize());
        }
    }

    @Nested
    @DisplayName("Tests for removing figures")
    class RemoveFigureTests {

        @Test
        @DisplayName("Remove a square")
        void testRemoveSquare() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5);
            // when
            shapeCollector.addFigure(square);
            shapeCollector.removeFigure(square);
            // then
            assertEquals(0, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Remove a circle")
        void testRemoveCircle() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5);
            // when
            shapeCollector.addFigure(circle);
            shapeCollector.removeFigure(circle);
            // then
            assertEquals(0, shapeCollector.getShapesSize());
        }

        @Test
        @DisplayName("Remove a triangle")
        void testRemoveTriangle() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5,2);
            // when
            shapeCollector.addFigure(triangle);
            shapeCollector.removeFigure(triangle);
            // then
            assertEquals(0, shapeCollector.getShapesSize());
        }
    }

    @Nested
    @DisplayName("Tests for getting figures")
    class GetFigureTests {

        @Test
        @DisplayName("Get a square")
        void testGetSquare() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5);
            // when
            shapeCollector.addFigure(square);
            //then
            assertEquals(square, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Get a circle")
        void testGetCircle() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5);
            // when
            shapeCollector.addFigure(circle);
            //then
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        @DisplayName("Get a triangle")
        void testGetTriangle() {
            // given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(5,2);
            // when
            shapeCollector.addFigure(triangle);
            //then
            assertEquals(triangle, shapeCollector.getFigure(0));
        }
    }

    @Test
    @DisplayName("Show all figures")
    void testShowFigures() {
        // given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);
        shapeCollector.addFigure(square);
        Shape circle = new Circle(5);
        shapeCollector.addFigure(circle);
        Shape triangle = new Triangle(5, 2);
        shapeCollector.addFigure(triangle);
        assertEquals("Square, Circle, Triangle, ", shapeCollector.showFigures());
    }
}