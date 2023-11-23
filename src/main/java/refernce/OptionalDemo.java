package refernce;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String>e=Optional.empty();
        System.out.println(e.isPresent());
        Optional e1=Optional.of("hello yes");
        System.out.println(e1.isPresent());
        System.out.println(e1.get());
        System.out.println(e1.filter((s)->s.equals("hello yes")));

    }
}
