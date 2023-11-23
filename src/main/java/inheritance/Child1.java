package inheritance;

public class Child1 extends Parent1{
    int c,d;
    Child1(int a,int b,int c, int d) {
        super(a, b);
        this.c=c;
        this.d=d;

    }
    void display(){
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(this.c);
        System.out.println(this.d);
    }

    public void f1(){
        super.f1();
        System.out.println("inside child f1");
    }
}
