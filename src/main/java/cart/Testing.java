package cart;

public class Testing {

        Testing(){System.out.println("hello a");}
        Testing(int x){
            this();
            System.out.println(x);
        }
    }
    class TestThis5{
        public static void main(String args[]){
            Testing a=new Testing(10);
        }
}

