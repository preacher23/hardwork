package principle;

class Demo{
    private int a;
    Demo(){
        a=10;
    }
    public void get(){
        System.out.println( a);
    }
}
public class Demoexe {
    public static void main(String[] args) {
      Demo demo=new Demo();
      demo.get();
    }
}
