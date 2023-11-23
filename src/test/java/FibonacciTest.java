import oneclass.FactorialClass;
import oneclass.FibonacciClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void fibonacciTest(){
        FibonacciClass fibonacciClass=new FibonacciClass();
        int n = 10, firstTerm = 0, secondTerm = 1;
        int fibonacci = fibonacciClass.fibonacci();
        Assert.assertNotNull(fibonacci);
    }
}
