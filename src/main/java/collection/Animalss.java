package collection;

import java.util.HashSet;

public class Animalss {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(new Test());
        s.add(new Test());
        for (Object i : s) {
            System.out.println("first");
            System.out.println(i);
        }
    }
}
    class Test {
        public int i = 12;

        public Test() {
            System.out.println("fi,fi");
            i = 13;
            i=42;
        }


        public String toString() {
            return "Animal" + i;
        }
    }


