package javaanother8;

public class MyClassOne {
    public  void mymethod123(int i){
        System.out.println("hiiii");
    }
    public static void main(String[] args) {
//        Myinterface m= i -> System.out.println(i);
//        m.myMethod(5);

        MyClassOne myClassOne=new MyClassOne();
        Myinterface myinterface=myClassOne::mymethod123;
        myinterface.myMethod(20);

    }
    }

