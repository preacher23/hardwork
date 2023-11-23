package innerclasses;

public class Staticinnerclass {
    public static void f1(){
        System.out.println("yes");
    }
    static class inner{
        static void f2(){
            System.out.println("nooo");
        }
        void f3(){
            System.out.println("yes non static");
        }
    }

    public static void main(String[] args) {
        Staticinnerclass.f1();
        Staticinnerclass.inner.f2();
        Staticinnerclass.inner object= new Staticinnerclass.inner();
        object.f3();
    }
}
