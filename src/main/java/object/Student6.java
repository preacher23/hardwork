package object;

class Student6{
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Student6(Student6 s1){
    id = s1.id;
    name =s1.name;
    }


    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Student6 s1 = new Student6(111,"Karan");  
    Student6 s2 = new Student6(s1);
    Student6 s3= new Student6(s2);
    s1.display();  
    s2.display();
    s3.display();
   }  
}  