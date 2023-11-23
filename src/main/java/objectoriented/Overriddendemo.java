package objectoriented;

abstract class Vehicle implements cricket{
    public void run(){
        System.out.println("vehicle running");
    }
    public final void walk(){
        System.out.println("yes");
    }

}

abstract class Car extends Vehicle{
    public void run(){
        System.out.println("car runing");
    }
}
public class Overriddendemo {
    public static void main(String[] args) {
//     Vehicle vehicle=new Vehicle();
////     vehicle.run();
//     Car car=new Car();
//     car.run();
//     Vehicle vehicle1=new Car();
//     vehicle1.run();
    }
}
