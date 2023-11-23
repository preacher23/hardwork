package cart;

public interface A {
    void a();
    void b();
    void c();
    void d();
}

abstract class B1 implements A{

}

class M extends B1{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}

    @Override
    public void c() {
        System.out.println("iam c");
    }

    public void d(){System.out.println("I am d");}
}

class Test5{
    public static void main(String args[]){
        A a=new M();
        M m= new M();
        m.a();
        a.a();
        a.b();
        a.c();
        a.d();
    }}

