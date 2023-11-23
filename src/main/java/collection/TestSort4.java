package collection;


import java.util.ArrayList;
import java.util.Collections;

class Student  {
    public String name;
    public  int id;
    public Student(String name,int id) {
        this.name = name;
        this.id=id;
    }
//    public int compareTo(Student person) {
//        return name.compareTo(person.name);
//
//    }
}
public class TestSort4 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Viru",1));
        al.add(new Student("Saurav",2));
        al.add(new Student("Mukesh",3));
        al.add(new Student("Tahir",4));
        al.add(new Student("gokl",5));

       // Collections.sort(al);
        for (Student s : al) {
            System.out.println(s.name+","+s.id);
        }
    }
}