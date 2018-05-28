package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickBottomDecorator extends AbstractPizzaOrderDecorator {
    public ThickBottomDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", thick bottom variant";
    }
}
