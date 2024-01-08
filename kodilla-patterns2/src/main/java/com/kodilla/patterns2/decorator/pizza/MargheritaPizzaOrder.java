package com.kodilla.patterns2.decorator.pizza;

public class MargheritaPizzaOrder implements PizzaOrder {
    @Override
    public double getCost() {
        return 20.0;
    }

    @Override
    public String getDescription() {
        return "Pizza Margherita (ciasto, sos pomidorowy, ser, pomidory, bazylia)";
    }
}