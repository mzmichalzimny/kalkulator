package com.kodilla.patterns2.decorator.pizza;

public class PepperoniPizzaOrder implements PizzaOrder {
    @Override
    public double getCost() {
        return 22.0;
    }

    @Override
    public String getDescription() {
        return "Pizza Pepperoni (ciasto, sos pomidorowy, ser, pepperoni)";
    }
}