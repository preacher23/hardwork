package orderprocess;

import java.sql.SQLException;

public class OrderBoImpl implements OrderBo{
    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    OrderDao orderDao;
    @Override
    public boolean placeOrder(Order order) {
        try {
            int result = orderDao.create(order);
            if (result==0){
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    @Override
    public boolean cancelOrder(int id) {
        return false;
    }

    @Override
    public boolean deleteOrder(int id) {
        return false;
    }
}
