import javafx.beans.binding.When;
import orderprocess.Order;
import orderprocess.OrderBoImpl;
import orderprocess.OrderDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.SQLException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(JUnitPlatform.class)
public class OrderBoImplTest {
    @Mock
    OrderDao orderDao;
    OrderBoImpl orderBo;
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
         orderBo = new OrderBoImpl();
         orderBo.setOrderDao(orderDao);
    }
    @Test
    public void place_should_create() throws SQLException {

        OrderDao orderDao1= Mockito.mock(OrderDao.class);
        Order order=new Order();
        when(orderDao.create(any(Order.class))).thenReturn(new Integer(1));
        boolean b = orderBo.placeOrder(order);
        Assert.assertTrue(b);

    }
}
