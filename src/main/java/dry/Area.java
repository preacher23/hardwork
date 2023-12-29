package dry;

class Rectangle{
  double height;
  double width;
  public Rectangle(double height,double width){
      this.height=height;
      this.width=width;
  }
}
class Circle{
  double radius;
  public Circle(double r){
      this.radius=r;
  }
}
class Triangle{
    double base;
    double height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
}
class Areacalculator{
    Object shape;
    Areacalculator(Object shape){
        this.shape=shape;
    }
    public void calculate(){
        if (shape instanceof Rectangle){
            Rectangle r=(Rectangle) shape;
            System.out.println(r.height*r.width);

        }
        if (shape instanceof Circle){
            Circle c=(Circle) shape;
            System.out.println(3.14*c.radius*c.radius);
        }
        if (shape instanceof Triangle){
            Triangle c=(Triangle) shape;
            System.out.println(3.14*c.base*c.height);
        }
    }
}
public class Area {
    public static void main(String[] args) {
Areacalculator areacalculator=new Areacalculator(new Rectangle(1.2,3.4));
 areacalculator.calculate();
    }
}
