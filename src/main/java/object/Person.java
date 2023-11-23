package object;

class Person{
int id;  
String name;  
Person(int id,String name){
    System.out.println("fisrs sirst");
this.id=id;  
this.name=name;  
}  
}  
class Emp1 extends Person{
float salary;  
Emp1(int id,String name,float salary){

super(id,name);
    System.out.println("yes");//reusing parent constructor
this.salary=salary;  
}  
void display(){System.out.println(id+" "+name+" "+salary);}  
}  
class TestSuper5{  
public static void main(String[] args){  
Emp1 e1=new Emp1(1,"ankit",45000f);
e1.display();  
}}  