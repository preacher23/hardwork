package objectoriented;

interface AA {
    default void method() {
        System.out.println("yes method1");
    }
}
    interface AAA{
        default void method(){
            System.out.println("yes nethod2");
        }
    }

public class History implements AA,AAA {
    public static void main(String[] args) {




    }
    public void method () {
        AAA.super.method();
    }
}


