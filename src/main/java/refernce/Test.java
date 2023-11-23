package refernce;

public class Test {
    public static void main(String[] args) {
        Myinterface i= s -> new Myclass(s);
        i.get("hello");

        Myinterface i1= Myclass::new;
        i1.get("okay");
    }
}
