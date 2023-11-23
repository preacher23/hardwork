package java8;

public class MethodRefoDemo {
    public static void myMetjod(){
        for (int i=0;i<10;i++){
            System.out.println("child thread");
        }
    }
    public static void main(String[] args) {
      Runnable r=MethodRefoDemo::myMetjod;
      Thread t= new Thread(r);
      t.start();
      for (int i=0;i<5;i++){
          System.out.println("parent thread");
      }
    }
}
