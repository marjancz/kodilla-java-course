package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("40009234"));
        Country germany = new Country("Germany", new BigDecimal("128987455"));
        Country england = new Country("England", new BigDecimal("98123123"));

        Continent europe = new Continent("EUROPE",
                Arrays.asList(poland, germany, england));
        Continent northAmerica = new Continent("North America",
                Arrays.asList(new Country("USA", new BigDecimal("334549678")),
                        new Country("Canada", new BigDecimal("76987345"))));
        Continent africa = new Continent("Africa",
                Arrays.asList(new Country("Egypt", new BigDecimal("23000635")),
                        new Country("RPA", new BigDecimal("34456456"))));
        World worldList = new World(Arrays.asList(europe, northAmerica, africa));

        //When
        BigDecimal totalPeopleQuantity = worldList.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("736113926");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
