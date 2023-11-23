package abstraction;

public class Science implements Topic{
    @Override
    public void read() {
        System.out.println("reading science");
    }
}

 class Maths implements Topic{

    @Override
    public void read() {
        System.out.println("redaing maths");//loosely coupleddd
    }
}
class Subjects{
    public static void main(String[] args) {
        Topic t= new Maths();
        t.read();
    }
}