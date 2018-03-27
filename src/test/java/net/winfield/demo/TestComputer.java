package net.winfield.demo;

import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;

public class TestComputer {

    private static final Logger logger = LoggerFactory.getLogger(ComputerService.class);

    @Test
    public void testPlusOneOne_ShouldReturnTwo() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.plus(1, 1);
        Assert.assertEquals(result, "2.0");
    }

    @Test
    public void testPlusOneMinusOne_ShouldReturnZero() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.plus(1, -1);
        Assert.assertEquals(result, "0.0");
    }

    @Test
    public void testMinusOneOne_ShouldReturnZero() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.minus(1, 1);
        Assert.assertEquals(result, "0.0");
    }

    @Test
    public void testMinusOneMinusOne_ShouldReturnTwo() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.minus(1, -1);
        Assert.assertEquals(result, "2.0");
    }

    @Test
    public void testMinusOneMinusTwo_ShouldReturnMinusOne() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.minus(1, 2);
        Assert.assertEquals(result, "-1.0");
    }

    @Test
    public void testMultiTwoThree_ShouldReturnSix() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.multiple(2, 3);
        Assert.assertEquals(result, "6.0");
    }

    @Test
    public void testMultiTwoMinusThree_ShouldReturnMinusSix() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.multiple(2, -3);
        Assert.assertEquals(result, "-6.0");
    }

    @Test
    public void testDivideSixThree_ShouldReturnTwo() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.divide(6, 3);
        Assert.assertEquals(result, "2.0");
    }

    @Test
    public void testDivideSixMinusThree_ShouldReturnMinusTwo() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.divide(6, -3);
        Assert.assertEquals(result, "-2.0");
    }

    @Test
    public void testDevideSixFour_ShouldReturnOnePointFive() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.divide(6, 4);
        Assert.assertEquals(result, "1.5");
    }

    @Test
    public void testDevideFiveThree_ShouldReturnOnePointSeven() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.divide(5, 3);
        Assert.assertEquals(result, "1.7");
    }

    @Test
    public void testModOneOne_ShouldReturnZero() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.mod(1, 1);
        Assert.assertEquals(result, "0.0");
    }

    @Test
    public void testModThreeTwo_ShouldReturnOne() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.mod(3, 2);
        Assert.assertEquals(result, "1.0");
    }

    @Test
    public void testModThreeMinusTwo_ShouldReturnOne() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.mod(3, -2);
        Assert.assertEquals(result, "1.0");
    }

    @Test
    public void testModFourTwo_ShouldReturnZero() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.mod(4, 2);
        Assert.assertEquals(result, "0.0");
    }

    @Test
    public void testSquareTwo_ShouldReturnFour() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.square(2);
        Assert.assertEquals(result, "4.0");
    }

    @Test
    public void testSquareMinusTwo_ShouldReturnFour() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.square(-2);
        Assert.assertEquals(result, "4.0");
    }

    @Test
    public void testCublicTwo_ShouldReturnEight() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.cublic(2);
        Assert.assertEquals(result, "8.0");
    }

    @Test
    public void testCublicMinusTwo_ShouldReturnMinusEight() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.cublic(-2);
        Assert.assertEquals(result, "-8.0");
    }


    @Test
    public void testPowerTwoThree_ShouldReturnEight() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.power(2, 3);
        Assert.assertEquals(result, "8.0");
    }

    @Test
    public void testPowerMinusTwoThree_ShouldReturnEight() {
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.power(-2, 3);
        Assert.assertEquals(result, "-8.0");
    }

    @Test
    public void computer_divideZero_writeErrorLog() throws Exception {
        Logger logger = mock(Logger.class);
        ComputerService computerService = new ComputerService(logger);
        try {
            computerService.divide(6, 0);
        }
        catch (IllegalArgumentException e) {

        }
        Mockito.verify(logger).error("The 2nd parameter can not be zero.");
    }

    @Test
    public void computer_plusWithStubLoggerOneOne_ShouldReturnTwo() throws Exception {
        Logger logger = mock(Logger.class);
        ComputerService computerService = new ComputerService(logger);
        String result = computerService.plus(1, 1);
        Assert.assertEquals(result, "2.0");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void computer_divideZero_throwException() throws Exception {
        Logger logger = mock(Logger.class);
        ComputerService computerService = new ComputerService(logger);
        computerService.divide(6, 0);





        
    }
}
