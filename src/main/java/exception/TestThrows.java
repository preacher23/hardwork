package exception;

public class TestThrows  {
    //defining a method
    public static int divideNum(int m, int n)  {
        int div = m / n;
        return div;
    }
    //main method
    public static void main(String[] args) throws ArithmeticException{
        TestThrows obj = new TestThrows();
        try {
            System.out.println(obj.divideNum(45, 0));
        }
        catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }

        System.out.println("Rest of the code..");
    }
}
