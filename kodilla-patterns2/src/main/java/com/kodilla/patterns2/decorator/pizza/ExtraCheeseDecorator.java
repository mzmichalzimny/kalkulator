package com.kodilla.patterns2.decorator.pizza;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator {
    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", dodatkowy ser";
    }
}
