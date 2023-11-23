package refernce;

interface m4{
    public void f1();
}
class A{
    int x=10;
    public void show(){
        int x=100;
        m4 mn=()-> {System.out.println(x);
            System.out.println(this.x);};
        //mn.f1();
    }
}
public class Classxx {
    public static void main(String[] args) {
        A a=new A();
        a.show();

    }
}
