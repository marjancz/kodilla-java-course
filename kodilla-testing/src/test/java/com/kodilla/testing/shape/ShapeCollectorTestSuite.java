package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("\nAll tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPreparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test No. #" + testCounter + " has been executed successfully.");
    }

    private Shape shape;

    @Test
    public void addFigure() {
        //given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("Square", 2.5);
        //when
        collector.addFigure(square);
        //then
        Assert.assertEquals(1, collector.getShapesQuantity());
    }

    @Test
    public void removeFigure() {
        //given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle("Circle", 6.0);
        collector.addFigure(circle);
        //when
        boolean result = collector.removeFigure(circle);
        //then
        Assert.assertTrue(result);
    }

    @Test
    public void getFigure() {
        //given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle("Tringle", 12.3, 4.3);
        collector.addFigure(triangle);
        //when
        Shape result = collector.getFigure(0);
        //then
        Assert.assertEquals(triangle, result);
    }

    @Test
    public void showFigures() {
/*        //given
        ShapeCollector collector = new ShapeCollector();
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape triangle = new Triangle("Tringle", 12.3, 4.3);
        Shape square = new Square("Square", 3.3);
        Shape circle = new Circle("Circle", 2.6);
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.addFigure(circle);
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(circle);
        //when
        String result;
        for (Shape s : shapes) {
            result = s.getShapeName();
        }
        //then
        Assert.assertEquals(result, collector.showFigures());
*/
    }
}
