package variable;

import java8.A;

public abstract class Shape {
    abstract public void calculateArea();
}
class Rectangle1 extends Shape{
    double height;
    double width;
    Rectangle1(double height,double width){
        System.out.println("one two");
        this.height=height;
        this.width=width;
    }

    @Override
    public void calculateArea() {
        System.out.println("last");
        System.out.println(height*width);
    }
}
class Areacalulate{
    public void calculate(Shape shape){
        System.out.println("two");
        shape.calculateArea();
    }
}
 class delegation{
    public static void main(String[] args) {
        Areacalulate areacalulate=new Areacalulate();
        areacalulate.calculate(new Rectangle1(12,32));
    }
}
