package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SmallSizeDecorator extends AbstractPizzaOrderDecorator {
    public SmallSizeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().subtract(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", small size";
    }
}
