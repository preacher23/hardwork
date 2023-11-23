package cart;

public class MainTwo {





    public static void main(String[] args) {

//Creating an object of the class
        MainTwo obj = new MainTwo();
//invoking instance method
        System.out.println("The sum is: " + obj.add(12, 13));
    }


    //user-defined method because we have not used static keyword
    public int add(int a, int b)
        {
            int s;
            s = a + b;
//returning the sum
            return s;
        }
}






