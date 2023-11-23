package objectoriented;

public class Demo1 {
    private int a;
    public Demo1(){
        a=10;
    }
    public Demo1(int a){
        this.a=a;
    }
    public void get(){
        System.out.println("value of "+ a);
    }
    public static void main(String[] args) {
   Demo1 demo1=new Demo1();
   demo1.get();
   Demo1 demo11=new Demo1(100);
   demo11.get();
    }
}
