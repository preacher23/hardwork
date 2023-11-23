package cart;

public class Main {
    public static void main(String[] args) {
        Product product=new Product("mango",1000);
        Product product1=new Product("apple",2000);
        product1.setPrice(20);
        //System.out.println(product1);
       Cart cart = new Cart();
       cart.addCart(product1);
       cart.addCart(product);
       //cart.addCart(new Product("gauva",3000));
       // System.out.println(cart.getTotal());
        System.out.println(cart.cardData);
       // System.out.println(cart);


    }
}
