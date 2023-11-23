package java8;

public class Lambdaclass {

    public static void main(String[] args) {
        funinterfaceexample funinterfaceexample=()-> System.out.println("function without any argument and return type!implemented using lambda");
        funinterfaceexample.mymethod();
    }
}

interface funinterfaceexample{
    public void mymethod();
}
