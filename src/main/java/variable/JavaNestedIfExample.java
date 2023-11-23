package variable;

public class JavaNestedIfExample {
public static void main(String[] args) {    
    //Creating two variables for age and weight  
    int age=2;
    int weight=80;    
    //applying condition on age and weight  
    if(age>=18){    
        if(weight>80){
            System.out.println("You are eligible to donate blood");  
        }else {
            System.out.println("yesss");
        }
    }else {
        System.out.println("okkk");
    }
}}  