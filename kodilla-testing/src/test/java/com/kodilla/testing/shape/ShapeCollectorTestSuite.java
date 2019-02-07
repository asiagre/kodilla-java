package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(new Triangle(4.5, 7.3));

        //then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemovingFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5.5);
        shapeCollector.addFigure(circle);

        //when
        boolean result = shapeCollector.removeFigure(circle);

        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemovingFigureNotExisting() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5.5);

        //when
        boolean result = shapeCollector.removeFigure(circle);

        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(4.5);

        //when
        shapeCollector.addFigure(square);

        //then
        Assert.assertEquals(square, shapeCollector.getFigure(0));
    }

    @Test
    public void testShowingfigures() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(4.5);
        Shape circle = new Circle(5.5);
        Shape triangle = new Triangle(4.5, 7.3);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //when
        String result = shapeCollector.showFigures();
        String expected = square.toString() + "\n" + circle.toString() + "\n" + triangle.toString() + "\n";

        //then
        Assert.assertEquals(expected, result);
    }
}
