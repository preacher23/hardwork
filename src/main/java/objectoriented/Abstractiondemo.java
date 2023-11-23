package objectoriented;


import java8.A;

import java.util.ArrayList;

interface mobile{
    public void calling(String number);
    public void sendmessage(String message);
}
class Apple implements mobile{
     ArrayList<Integer>contacts=new ArrayList<>();
     public void getnumber(int number){
         contacts.add(number);
     }
    @Override
    public void calling(String number) {
        System.out.println("calling");
    }

    @Override
    public void sendmessage(String message) {
        System.out.println("messaggggggging");
    }
}
public class Abstractiondemo {
    public static void main(String[] args) {
        Apple applss=new Apple();
        applss.getnumber(123);
        samsung samsung=new samsung();
        samsung.calling("123");
        samsung.sendmessage("yes");
    }


}
abstract class mobilee{
    ArrayList<Integer>contacts=new ArrayList<>();
   abstract void calling(String number);
    abstract void sendmessage(String message);
    public void addcontact(int number){
        contacts.add(number);
    }
}

class samsung extends mobilee{

    @Override
    void calling(String number) {
        System.out.println("my calling");
    }

    @Override
    void sendmessage(String message) {
        System.out.println("my messages");
    }
}