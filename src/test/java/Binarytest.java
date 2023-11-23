import oneclass.MyOneClass;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@RunWith(PowerMockRunner.class)
//@PrepareForTest(MyOneClass.class)

public class Binarytest {

    MyOneClass myOneClass;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
         myOneClass = PowerMockito.mock(MyOneClass.class);
    }
    @Test
    public void binaryTest() throws Exception {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
         int expected =3;
        PowerMockito.whenNew(MyOneClass.class).withNoArguments().thenReturn(myOneClass);
        PowerMockito.when(myOneClass.binarySearch(arr, 7)).thenReturn(expected);
        int actual = myOneClass.binarySearch(arr, 7);
        //int result1 = myOneClass.binarySearch(arr, 7);
        assertEquals(expected, actual);

    }

}
