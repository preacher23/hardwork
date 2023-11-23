package object;

class B{
  A4 obj;  
  B(A4 obj){
      System.out.println("fisrt");
    this.obj=obj;
      System.out.println("gokul nath");
  }  
  void display(){
      System.out.println("second");
    System.out.println(obj.data);//using data member of A4 class
  }  
}  
  
class A4{  
  int data=10;  
  A4(){
      System.out.println("first first");
   B b=new B(this);
      System.out.println("gokul");
   b.display();
      System.out.println("third");
  }  
  public static void main(String args[]){
      System.out.println("the first");
   A4 a=new A4();
      System.out.println("four");
  }  
}  