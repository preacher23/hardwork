package cart;

public class TestingGokul {
    int data=50;

    void change(int data){
        System.out.println( data=data+100);//changes will be in the local variable only
    }

    public static void main(String args[]){
        TestingGokul op=new TestingGokul();

        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);

    }
}
