package object;

class A1{
    A1(){
        this(20);


        System.out.println("hello a");
    }
    A1(int x){
        System.out.println(x);
    }
    A1(double y){
        System.out.println(y);
    }
}
class TestThis6{
    public static void main(String args[]){
        A1 a=new A1();
    }}
