import oneclass.MyOneClass;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MyOneClass.class)
public class MyOneClassTest {


   @Test
    void testPublicMethod() {
        MyOneClass myClass = new MyOneClass();
        String result = myClass.tamilMethod();
        assertEquals("This is a tamil method.", result);
    }
    @Test
    void testStaticMethod() {
        String result = MyOneClass.englishMethod();
        assertEquals("This is a english method.", result);
    }
              @Test
              public void testBinarySearch(){
                int[] arr = {1, 3, 5, 7, 9, 11, 13};

                MyOneClass myOneClass=new MyOneClass();
                int result1 = myOneClass.binarySearch(arr, 7);
                assertEquals(3, result1);

                int result2 = myOneClass.binarySearch(arr, 1);
                assertEquals(0, result2);

                int result3 = myOneClass.binarySearch(arr, 13);
                assertEquals(6, result3);

                int result4 = myOneClass.binarySearch(arr, 8);
                assertEquals(-1, result4);

                int result5 = myOneClass.binarySearch(arr, 6);
                assertEquals(-1, result5);
            }

//            @Test
//          public void testpalindrome() throws Exception {
//
//                //PowerMockito.mockStatic(MyOneClass.class);
//                PowerMockito.spy(MyOneClass.class);
//                PowerMockito.doReturn(true).when(MyOneClass.class,"mypalindrome","radar");
//                PowerMockito.doReturn(false).when(MyOneClass.class,"mypalindrome","radar");
////                PowerMockito.when(MyOneClass.class, "mypalindrome", String.class).thenReturn(true);
////                PowerMockito.when(MyOneClass.class, "mypalindrome", String.class).thenReturn(false);
//                MyOneClass myOneClass=new MyOneClass();
//               boolean result=myOneClass
//                assertEquals("radar",result);
//
//
//            }
            @Test
            public void testReverse(){
                String result = MyOneClass.reverseWord();
                assertEquals("olleH", result);
            }

            @Test
            public void testMypalindrome() throws Exception {
                // Arrange
                MyOneClass checker = new MyOneClass();
                String input = "A man, a plan, a canal, Panama";

                // Act
                boolean result = Whitebox.invokeMethod(checker, "mypalindrome", input);

                // Assert
                assertEquals(true, result);
            }
        }






