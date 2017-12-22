import org.testng.Assert;
import org.testng.annotations.Test;

public class TestComputer {

    @Test
    public void testPlusOneOne_ShoudleReturnTwo() {
        ComputerService computerService = new ComputerService();
        float result = computerService.plus(1, 1);
        Assert.assertEquals(result, 2.0, 0);
    }
  
  
  
  
  
}
