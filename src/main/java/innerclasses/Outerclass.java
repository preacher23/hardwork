package innerclasses;

public class Outerclass {
    void f1(){
        System.out.println("outer classes non static method");
    }
    class Inner{
        void f2(){
            System.out.println("inner class non static method");
        }
    }
    public static void main(String[] args) {
      Outerclass outerclass=new Outerclass();
      outerclass.f1();
      Outerclass.Inner obj= outerclass.new Inner();
      obj.f2();
    }
}
