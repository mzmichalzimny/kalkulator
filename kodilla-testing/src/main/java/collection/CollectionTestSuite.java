package collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: początek");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: koniec");
    }

    @DisplayName("when create OddNumbersExterminator with empty list, " +
            "then exterminate should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> emptyList = Arrays.asList();

        //When
        List<Integer> result = exterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, result);
    }

    @DisplayName("when create OddNumbersExterminator with normal list, " +
            "then exterminate should return only even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6);

        //When
        List<Integer> result = exterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(evenNumbers, result);
    }
}