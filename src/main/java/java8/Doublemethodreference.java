package java8;

public class Doublemethodreference {

    public static void main(String[] args) {
        myInterfaceNew myInterfaceNew=()-> System.out.println("yes");
        myInterfaceNew.mymethod1();


    }
    static void  mymethod2(){
        System.out.println("yes");
    }

}

interface myInterfaceNew{
    public void mymethod1();
}
class Newclass{
    public static void main(String[] args) {
        myInterfaceNew myInterfaceNew=Doublemethodreference::mymethod2;
        myInterfaceNew.mymethod1();
    }
}