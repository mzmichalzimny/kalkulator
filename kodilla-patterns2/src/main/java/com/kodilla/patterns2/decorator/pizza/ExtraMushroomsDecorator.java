package com.kodilla.patterns2.decorator.pizza;

public class ExtraMushroomsDecorator extends AbstractPizzaOrderDecorator {
    public ExtraMushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", dodatkowe pieczarki";
    }
}