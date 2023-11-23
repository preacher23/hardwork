package refernce;

interface  i{
    public  default void mm(){
        System.out.println("yes default");
    }
    public  void gg();
}
interface j{
    public default void mm(){
        System.out.println("interface j");
    }
}
public class DefaultMethod implements i,j{
    public static void main(String[] args) {
        DefaultMethod defaultMethod=new DefaultMethod();
        defaultMethod.mm();

    }

    @Override
    public void mm() {
        j.super.mm();
    }

    @Override
    public void gg() {

    }
//
//    @Override
//    public void mm() {
//        System.out.println("hello");
//    }
//
//    @Override
//    public void gg() {
//
//    }
}
