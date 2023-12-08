package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame")
                .burgers(2)
                .sauce("Standard")
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Cucumber")
                .ingredient("Chilli peppers")
                .ingredient("Mushrooms")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(8, howManyIngredients);
    }
}