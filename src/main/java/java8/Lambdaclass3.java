package java8;

public class Lambdaclass3 {
    public static void main(String[] args) {
        funcinterface funcinterface=a->{
            int x=a+10;
            x=x/2;
            return x;
        };
        System.out.println(funcinterface.mymethod(10));
    }
}
interface funcinterface{
    public int mymethod(int a);
}