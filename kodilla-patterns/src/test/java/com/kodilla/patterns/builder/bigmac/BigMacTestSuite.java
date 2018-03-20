package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .ingredient("Onion")
                .roll("sesame")
                .burgers(2)
                .sauce("1000 islands")
                .sauce("Barbecue")
                .ingredient("Lettuce")
                .ingredient("Mushrooms")
                .ingredient("Chili")
                .ingredient("Becon")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        int howManySouces = bigMac.getSauces().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
        Assert.assertEquals(2,howManySouces);
    }
}
