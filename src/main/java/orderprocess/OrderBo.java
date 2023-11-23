package orderprocess;

public interface OrderBo {
    boolean placeOrder(Order order);
    boolean cancelOrder(int  id);

    boolean deleteOrder(int id);
}
