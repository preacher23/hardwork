package exception;

import java.io.IOException;

class M1{
    void method(){
        System.out.println("device operation performed");
    }
}
class TestThrows4{
    public static void main(String args[]) throws IOException {//declare exception
        M1 m=new M1();
        m.method();

        System.out.println("normal flow...");
    }
}
