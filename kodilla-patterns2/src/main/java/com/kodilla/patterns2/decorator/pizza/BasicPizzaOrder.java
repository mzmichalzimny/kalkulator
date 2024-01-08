package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public double getCost() {
        return 15.0;
    }

    @Override
    public String getDescription() {
        return "Pizza (ciasto i sos pomidorowy z serem)";
    }
}