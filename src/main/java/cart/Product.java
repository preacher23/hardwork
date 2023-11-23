package cart;


public class Product {
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {
    }

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                '}';
    }

    String product;
    int price;



}
