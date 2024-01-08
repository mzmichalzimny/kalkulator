package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        double calculatedCost = theOrder.getCost();

        // Then
        assertEquals(15.0, calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem)", description);
    }

    @Test
    public void testPizzaWithExtraCheeseGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        // When
        double theCost = theOrder.getCost();

        // Then
        assertEquals(20.0, theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem), dodatkowy ser", description);
    }

    @Test
    public void testMargheritaPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new MargheritaPizzaOrder();

        // When
        double calculatedCost = theOrder.getCost();

        // Then
        assertEquals(20.0, calculatedCost);
    }

    @Test
    public void testMargheritaPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new MargheritaPizzaOrder();

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Pizza Margherita (ciasto, sos pomidorowy, ser, pomidory, bazylia)", description);
    }

    @Test
    public void testPepperoniPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new PepperoniPizzaOrder();

        // When
        double calculatedCost = theOrder.getCost();

        // Then
        assertEquals(22.0, calculatedCost);
    }

    @Test
    public void testPepperoniPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new PepperoniPizzaOrder();

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Pizza Pepperoni (ciasto, sos pomidorowy, ser, pepperoni)", description);
    }

    @Test
    public void testPizzaWithExtraCheeseAndOlivesGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraOlivesDecorator(theOrder);

        // When
        double theCost = theOrder.getCost();

        // Then
        assertEquals(23.0, theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseAndOlivesGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraOlivesDecorator(theOrder);

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem), dodatkowy ser, dodatkowe oliwki", description);
    }

    @Test
    public void testPizzaWithExtraCheeseOlivesAndMushroomsGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraOlivesDecorator(theOrder);
        theOrder = new ExtraMushroomsDecorator(theOrder);

        // When
        double theCost = theOrder.getCost();

        // Then
        assertEquals(27.0, theCost);
    }

    @Test
    public void testPizzaWithExtraCheeseOlivesAndMushroomsGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraOlivesDecorator(theOrder);
        theOrder = new ExtraMushroomsDecorator(theOrder);

        // When
        String description = theOrder.getDescription();

        // Then
        assertEquals("Pizza (ciasto i sos pomidorowy z serem), dodatkowy ser, dodatkowe oliwki, dodatkowe pieczarki", description);
    }
}