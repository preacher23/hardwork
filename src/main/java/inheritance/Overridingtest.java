package inheritance;

import java8.B;

public class Overridingtest {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car.fuel());
        Bike bike=new Bike();
        System.out.println(bike.fuel());
        Bus bus=new Bus();
        System.out.println(bus.fuel());
    }
}
