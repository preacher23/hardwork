package java8;

public class Lambdaclass1 {

    public static void main(String[] args) {
        functioninterface functioninterface=(a,b)-> System.out.println(a+b);
        functioninterface.funcmethod(1,2);
    }
}

interface functioninterface{
    public void funcmethod(int a,int b);
}
