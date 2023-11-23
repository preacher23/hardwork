package objectoriented;

class Addition1{
    public void add(int a,int b){
        System.out.println("sum"+ (a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("sum"+(a+b+c));
    }
}
public class Overloadingdemo {
    public static void main(String[] args) {
   Addition1 addition1=new Addition1();
   addition1.add(12,21);
   addition1.add(12,34,56);
    }
}
