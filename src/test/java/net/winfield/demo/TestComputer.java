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
}
