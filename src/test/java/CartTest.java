import cart.Cart;
import cart.Product;
import oneclass.BubbleSort;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CartTest {
    @Mock
    Cart cart;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cart = new Cart();
    }


    @Test
    public void addcartTest(){
        Product product1= new Product("apple",10);
        Product product2= new Product("strawberry",20);
        Product product3=new Product("pineapple",30);
        cart.addCart(product1);
        cart.addCart(product2);
        cart.addCart(product3);
        int expectedtotal=60;
        int actualtotal=cart.getTotal();
        Assert.assertEquals(expectedtotal,actualtotal);


    }
    @Test
    public void getTotalTest(){
        Product product1= new Product("apple",20);
        Product product2= new Product("strawberry",30);
        int expectedtotal=product1.getPrice()+ product2.getPrice();
        int actualtotal=cart.getTotal();
        Assert.assertEquals(expectedtotal,actualtotal);
    }


//    public void testAddCartNull() {
//        // Pass a null product to the addCart method
//
//    }
}
