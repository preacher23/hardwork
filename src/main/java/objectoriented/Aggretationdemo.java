package objectoriented;


import java.util.ArrayList;
import java.util.List;

class college{
    String name;
    List<Teacher> teacher;
    college(String name, List<Teacher>teacher){
        this.name=name;
        this.teacher=teacher;
    }
    public List<Teacher>getTeacher(){
        return teacher;
    }
}

class Teacher{

    String name;
    String subject;
    public Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
//    @Override
//    public String toString(){
//        return "[Teacher:"+name+",Subject:"+subject+"]";
//    }
@Override
public String toString() {
    return "Teacher{" +
            "name='" + name + '\'' +
            ", subject='" + subject + '\'' +
            '}';
}

}
public class Aggretationdemo {
    public static void main(String[] args) {
        List<Teacher>teachers=new ArrayList<>();
        teachers.add(new Teacher("goks","eng"));
        teachers.add(new Teacher("gokss","tamil"));

        college college1=new college("goks1",teachers);

    }
}
