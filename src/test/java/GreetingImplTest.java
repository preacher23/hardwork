import example.GreetingImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GreetingImplTest {
    private GreetingImpl greeting;
    @BeforeEach
    public void setUp(){
        greeting = new GreetingImpl();
    }

   @Test
    public void greetShould(){
        String name = greeting.greet("gokul");
        Assertions.assertNotNull(name);
    }
    @Test
    public void greetShouldThrowAnException(){
      Assertions.assertThrows(IllegalArgumentException.class,()->{
          greeting.greet(null);
      });

    }
    @Test
    public void greetShouldThrowAnNull(){
     Assertions.assertThrows(IllegalArgumentException.class,()->{
         greeting.greet("");
     });

    }
}
