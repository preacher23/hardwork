import oneclass.FactorialClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Factorialtest {
    @Test
    public void testFactorial(){
        FactorialClass factorialClass= new FactorialClass();
        int fact=factorialClass.factorialMethod();
        Assert.assertSame(120,fact);
    }
}
