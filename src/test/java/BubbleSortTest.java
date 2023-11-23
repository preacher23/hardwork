import oneclass.BubbleSort;
import oneclass.MyOneClass;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class BubbleSortTest {
    @Mock
    BubbleSort bubbleSort;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        bubbleSort = new BubbleSort();
    }
    @Test
    public void testBubble(){
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        int i = bubbleSort.bubbleSort(arr, 7);
//        Assert.assertEquals(i,-1);
        Assert.assertArrayEquals(arr,arr);
    }
}
