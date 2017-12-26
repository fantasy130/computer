package net.winfield.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestComputer {

    @Test
    public void testPlusOneOne_ShouldReturnTwo() {
        ComputerService computerService = new ComputerService();
        float result = computerService.plus(1, 1);
        Assert.assertEquals(result, 2.0, 0);
    }

    @Test
    public void testPlusOneMinusOne_ShouldReturnZero() {
        ComputerService computerService = new ComputerService();
        float result = computerService.plus(1, -1);
        Assert.assertEquals(result, 0.0, 0);
    }

    @Test
    public void testMinusOneOne_ShouldReturnZero() {
        ComputerService computerService = new ComputerService();
        float result = computerService.minus(1, 1);
        Assert.assertEquals(result, 0.0, 0);
    }

    @Test
    public void testMinusOneMinusOne_ShouldReturnTwo() {
        ComputerService computerService = new ComputerService();
        float result = computerService.minus(1, -1);
        Assert.assertEquals(result, 2.0, 0);
    }

    @Test
    public void testMinusOneMinusTwo_ShouldReturnMinusOne() {
        ComputerService computerService = new ComputerService();
        float result = computerService.minus(1, 2);
        Assert.assertEquals(result, -1.0, 0);
    }

    @Test
    public void testMultiTwoThree_ShouldReturnSix() {
        ComputerService computerService = new ComputerService();
        float result = computerService.multiple(2, 3);
        Assert.assertEquals(result, 6.0, 0);
    }

    @Test
    public void testMultiTwoMinusThree_ShouldReturnMinusSix() {
        ComputerService computerService = new ComputerService();
        float result = computerService.multiple(2, -3);
        Assert.assertEquals(result, -6.0, 0);
    }

    @Test
    public void testDevideSixThree_ShouldReturnTwo() {
        ComputerService computerService = new ComputerService();
        String result = computerService.devide(6, 3);
        Assert.assertEquals(result, "2.0");
    }

    @Test
    public void testDevideSixMinusThree_ShouldReturnMinusTwo() {
        ComputerService computerService = new ComputerService();
        String result = computerService.devide(6, -3);
        Assert.assertEquals(result, "-2.0");
    }

    @Test
    public void testDevideSixFour_ShouldReturnOnePointFive() {
        ComputerService computerService = new ComputerService();
        String result = computerService.devide(6, 4);
        Assert.assertEquals(result, "1.5");
    }

    @Test
    public void testDevideFiveThree_ShouldReturnOnePointSeven() {
        ComputerService computerService = new ComputerService();
        String result = computerService.devide(5, 3);
        Assert.assertEquals(result, "1.7");
    }

    @Test
    public void testModOneOne_ShouldReturnZero() {
        ComputerService computerService = new ComputerService();
        float result = computerService.mod(1, 1);
        Assert.assertEquals(result, 0.0, 0);
    }

    @Test
    public void testModThreeTwo_ShouldReturnOne() {
        ComputerService computerService = new ComputerService();
        float result = computerService.mod(3, 2);
        Assert.assertEquals(result, 1.0, 0);
    }

    @Test
    public void testModThreeMinusTwo_ShouldReturnOne() {
        ComputerService computerService = new ComputerService();
        float result = computerService.mod(3, -2);
        Assert.assertEquals(result, 1.0, 0);
    }

    @Test
    public void testModFourTwo_ShouldReturnZero() {
        ComputerService computerService = new ComputerService();
        float result = computerService.mod(4, 2);
        Assert.assertEquals(result, 0.0, 0);
    }

    @Test
    public void testSquareTwo_ShouldReturnFour() {
        ComputerService computerService = new ComputerService();
        float result = computerService.square(2);
        Assert.assertEquals(result, 4.0, 0);
    }

    @Test
    public void testSquareMinusTwo_ShouldReturnFour() {
        ComputerService computerService = new ComputerService();
        float result = computerService.square(-2);
        Assert.assertEquals(result, 4.0, 0);
    }
}
