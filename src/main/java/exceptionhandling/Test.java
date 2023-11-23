package exceptionhandling;

public class Test {
    public static void main(String[] args) throws Checkedcustomexception {
        throw  new Uncheckedcustomexception("yessss");
        //throw new Checkedcustomexception("yessss check");
    }
}
