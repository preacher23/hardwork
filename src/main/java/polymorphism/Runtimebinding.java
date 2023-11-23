package polymorphism;

public class Runtimebinding {
    public static void main(String[] args) {
        Macbook macbook=new Macbookair();
        Macbook macbook1=new Macbookpro();
        macbook.start();
        macbook.shutdown();
        macbook1.start();
        macbook1.shutdown();
    }
}
