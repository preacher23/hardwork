package innerclasses;

public class Localinnerclass {
    void f1(){
        System.out.println("inside outer class");
        class Localinner{
            void f2(){
                System.out.println("inside local");
            }
        }
        System.out.println("heree");
        Localinner localinner=new Localinner();
        System.out.println("here2");
        localinner.f2();
    }
    public static void main(String[] args) {
    Localinnerclass localinnerclass= new Localinnerclass();
    localinnerclass.f1();
    }
}
