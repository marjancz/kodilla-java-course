package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("\nTest Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("\nTest Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //sprawdzi czy klasa zachowuje się poprawnie gdy lista jest pusta

        //Given
        ArrayList<Integer> listNumbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> nums = exterminator.exterminate(listNumbers);
        System.out.println("Testing if list is empty. Now list contains: " + nums);

        //Then
        Assert.assertEquals(listNumbers.size(), nums.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        // sprawdzi czy klasa zachowuje się poprawnie gdy lista zawiera liczby parzyste i nieparzyste

        //Given
        ArrayList<Integer> listNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<100; i++) {
            int randomNum = (random.nextInt(100) + 1);
            listNumbers.add(randomNum);
        }
        for (int i = 0; i < 100; i++) {
            if (listNumbers.get(i) % 2 == 0) {
                evenNumbers.add(listNumbers.get(i));
            }
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        ArrayList<Integer> evenList = exterminator.exterminate(listNumbers);
        System.out.println("Testing if list contains even and odd numbers");

        //Then
        Assert.assertEquals(listNumbers.size(), evenList.size());
    }
}
