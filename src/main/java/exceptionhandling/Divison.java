package exceptionhandling;

import java.util.Scanner;

public class Divison {
    public static void main(String[] args) {
        int a,b,c;
        try {
            System.out.println("enter two integers");
            Scanner obj = new Scanner(System.in);
            a = obj.nextInt();
            b = obj.nextInt();
            c = a / b;
            System.out.println("result" + c);
        }catch (ArithmeticException e){
            System.out.println("please dont enter 0");
        }
        System.out.println("more code");
    }
}
