package object;

public class Emp {
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {
    System.out.println("third");
    this.id = id;  
    this.name = name;  
    this.address=address;
    System.out.println("fourth");
}  
  
void display(){
    System.out.println("fifth");
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country+address.plan);
    System.out.println("sixth");
}  
  
public static void main(String[] args) {  
Address address1=new Address("gzb","UP","india","plan a");
    System.out.println("fisrt first");
Address address2=new Address("gno","UP","india","paln b");
    System.out.println("second second");
  
Emp e=new Emp(111,"varun",address1);
    System.out.println("thidr third");
Emp e2=new Emp(112,"arun",address2);
    System.out.println("foutth fourth");
    System.out.println("fifth fifth");
e.display();
    System.out.println("dixth sixth");
e2.display();  
      
}  
}  