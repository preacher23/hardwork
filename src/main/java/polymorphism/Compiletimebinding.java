package polymorphism;

public class Compiletimebinding {
    void add(int a,int b){
        int res=a+b;
        System.out.println(res);
    }
    void add(float a,float b){
        float res1=a+b;
        System.out.println(res1);
    }

    public static void main(String[] args) {
        Compiletimebinding compiletimebinding=new Compiletimebinding();
        compiletimebinding.add(12,23);
        compiletimebinding.add(12.0f,23.4f);
    }
}
