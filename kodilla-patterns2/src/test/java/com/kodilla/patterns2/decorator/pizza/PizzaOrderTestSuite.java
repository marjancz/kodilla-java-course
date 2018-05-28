package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testThickBottomPizzaCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickBottomDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void testThickBottomPizzaDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ThickBottomDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with tomato souce and cheese, thick bottom variant", description);
    }

    @Test
    public void testSmallPizzaWithTwoIngredientsCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SmallSizeDecorator(theOrder);
        theOrder = new SalamiIngredientDecorator(theOrder);
        theOrder = new JalapenoIngredientDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }

    @Test
    public void testSmallPizzaWithTwoIngredientsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new SmallSizeDecorator(theOrder);
        theOrder = new SalamiIngredientDecorator(theOrder);
        theOrder = new JalapenoIngredientDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with tomato souce and cheese, small size + salami + jalapeno", description);
    }

    @Test
    public void testLargePizzaFiveIngredientsDiscountCodeCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargeSizeDecorator(theOrder);
        theOrder = new SalamiIngredientDecorator(theOrder);
        theOrder = new JalapenoIngredientDecorator(theOrder);
        theOrder = new MushroomsIngredientDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSouceDecorator(theOrder);
        theOrder = new DiscountCodeDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40.5), theCost);
    }

    @Test
    public void testLargePizzaFiveIngredientsDiscountCodeDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargeSizeDecorator(theOrder);
        theOrder = new SalamiIngredientDecorator(theOrder);
        theOrder = new JalapenoIngredientDecorator(theOrder);
        theOrder = new MushroomsIngredientDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSouceDecorator(theOrder);
        theOrder = new DiscountCodeDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with tomato souce and cheese, large size + salami + jalapeno + mushrooms + extra cheese + galic souce, 10% discount code", description);
    }
}