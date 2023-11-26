package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Ukraine", new BigDecimal("38000000")));
        asia.addCountry(new Country("China", new BigDecimal("38000000")));
        asia.addCountry(new Country("Mongolia", new BigDecimal("38000000")));
        australia.addCountry(new Country("New Zeland", new BigDecimal("38000000")));
        australia.addCountry(new Country("Australia", new BigDecimal("38000000")));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(australia);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeople = new BigDecimal("228000000");
        assertEquals(expectedPeople, totalPeople);
    }
}