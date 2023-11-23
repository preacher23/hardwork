package principle;

public abstract class Department {
    public abstract int getEmployee();
    public abstract void method();
}
class Deptone extends Department{

    @Override
    public int getEmployee() {
        return 100;
    }

    @Override
    public void method() {
        System.out.println("our  department");
    }
}