package refernce;



interface m1{
    public void g1();
}
//class gokul implements m1{//without lambda expression
//
//    @Override
//    public void g1() {
//        System.out.println("iam g1");
//    }
//}
public class Jadu {
    public static void main(String[] args) {
//        gokul gokul=new gokul();
//        gokul.g1();
        m1 m=()->{
            System.out.println("hi");
        };
        m.g1();
    }
}
