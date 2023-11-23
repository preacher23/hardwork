package exception;

public class JavaExceptionExample {
    int id=1;
    String s=null;
    public static void main(String args[]){
        try{
            //code that may raise exception
            //int data=10000/0;


            //String string= null;
            JavaExceptionExample j=new JavaExceptionExample();
            System.out.println(j.id);


        }catch(NullPointerException e)
        {System.out.println("hi");
        }
        //rest code of the program
        System.out.println("rest of the code...");
    }
}
