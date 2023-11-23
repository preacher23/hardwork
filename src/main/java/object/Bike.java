package object;

abstract class Bike22{
   Bike22()

   {
       System.out.println("fisrst");
       System.out.println("bike is created");
   }
   abstract void run();  
   void changeGear()
   {
       System.out.println("third");
       System.out.println("gear changed");}
 }  
//Creating a Child class which inherits Abstract class  
 class Honda extends Bike22{
    Honda(){
        System.out.println("fisr sirst");
    }
 void run()
 {
     System.out.println("second");
     System.out.println("running safely..");}
 }  
//Creating a Test class which calls abstract and non-abstract methods  
 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike22 obj = new Honda();
  obj.run();  
  obj.changeGear();  
 }  
}