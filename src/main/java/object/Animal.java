package object;

class Animal{
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("myclass");
    }
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}  