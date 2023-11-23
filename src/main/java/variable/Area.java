package variable;

class Rectangle{
   double height;
   double width;
   Rectangle(double height,double width){
       System.out.println("two two");
       this.height=height;
       this.width=width;
   }
}
class Circle{
  double radius;
  Circle(double r){
      System.out.println("two");
      this.radius=r;
  }
}
class Areaccalculator{
    Object shape;
    public Areaccalculator(Object shape){
        System.out.println("one");
        this.shape=shape;
    }
    public void calculate(){
        if (shape instanceof Circle){
            System.out.println("five five");
            Circle c=(Circle) shape;
            System.out.println("five five five");
            System.out.println(3.14*c.radius);
        }
        if (shape instanceof  Rectangle){
            System.out.println("four four");
            Rectangle r=(Rectangle) shape;
            System.out.println("four four four");
            System.out.println(r.height * r.width);
        }
    }
}
public class Area {
    public static void main(String[] args) {
          Areaccalculator areaccalculator=new Areaccalculator(new Rectangle(4.0,6.0));
          //Areaccalculator areaccalculator1=new Areaccalculator(new Circle(2.0));
          //areaccalculator1.calculate();
          areaccalculator.calculate();
    }
}
