package cart;

public class Student {

        int id;
        String name;
        //constructor to initialize integer and string
        Student(int i,String n){
            id = i;
            name = n;
        }
        //constructor to initialize another object
        Student(Student s){
            id = s.id;
            name =s.name;
        }
        void display()
        {System.out.println(id+" "+name);}

        public static void main(String args[]){
            Student s1 = new Student(11111,"Karan");
            Student s3= new Student(23456,"gokul");
            Student s2 = new Student(s3);
            s1.id=29;
            s1.display();
            s2.display();
        }
    }

