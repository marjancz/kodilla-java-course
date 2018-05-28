package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DiscountCodeDecorator extends AbstractPizzaOrderDecorator {
    public DiscountCodeDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().subtract(super.getCost()
                .multiply(new BigDecimal(10))
                .divide(new BigDecimal(100))
        );
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", 10% discount code";
    }
}
