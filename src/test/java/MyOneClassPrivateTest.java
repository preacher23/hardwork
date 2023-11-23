import oneclass.MyOneClassPrivate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyOneClassPrivateTest {
    @Test
    void testfrenchMethod() {
        MyOneClassPrivate myClass = new MyOneClassPrivate();
        String result = myClass.frenchMethod();
       Assertions.assertEquals("This is a german only method.", result);
    }

}
