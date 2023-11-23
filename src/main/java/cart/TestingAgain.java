package cart;

public class TestingAgain {
    int data=50;

    void change(TestingAgain op){
        op.data=op.data+100;//changes will be in the instance variable
    }


    public static void main(String args[]){
        TestingAgain op=new TestingAgain();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}
