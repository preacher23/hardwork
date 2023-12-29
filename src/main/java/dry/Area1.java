package dry;

public abstract class Area1 {
    abstract public void calculatearea();
}
class Rectangle1 extends Area1{
    double height;
    double width;
    public Rectangle1(double height,double width){
        this.height=height;
        this.width=width;
    }

    @Override
    public void calculatearea() {
        System.out.println(height*width);
    }
}

class Areacalculator1{
    public void calculate(Area1 shape){
         shape.calculatearea();
    }
}
class Driver{
    public static void main(String[] args) {
        Areacalculator1 areacalculator1=new Areacalculator1();
        areacalculator1.calculate(new Rectangle1(1.2,2.2));
    }
}