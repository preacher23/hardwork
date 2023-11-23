package exceptionhandling;

public class Product {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    String name;
    int id;
    Product(String name,int id){
        this.name=name;
        this.id=id;
    }

}
