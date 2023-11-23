package abstraction;

public class ClassA {
    final static float pi=3.14f;
    public final void display(){
        System.out.println(ClassA.pi);
    }

    public static void main(String[] args) {
        ClassA classA=new ClassA();
        System.out.println( ClassA.pi);
    }
}
