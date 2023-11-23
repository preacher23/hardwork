package objectoriented;

public abstract class Department {
    public abstract int getemployee();
    public abstract void method();
    public void attendance(){
        System.out.println("iam present");
    }

}
class Deptone extends Department{

    @Override
    public int getemployee() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("implemented method");
    }
    public void attendance(){
        System.out.println("iam present in employee");
    }
}
