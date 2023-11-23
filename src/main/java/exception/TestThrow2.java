package exception;

import java.io.IOException;

class M{
    void method()throws IOException{
        System.out.println("hi");
        //throw new IOException("device error");

    }
}
public class TestThrow2{
    public static void main(String args[]){
        try{
            M m=new M();
            m.method();
        }catch(Exception e){System.out.println("exception handled"+","+e.getMessage());}

        System.out.println("normal flow...");
    }
}

