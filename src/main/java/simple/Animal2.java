package simple;

public class Animal2 {
    @Override
    public String toString() {
        return "Animal2{" +
                "id=" + id +
                '}';
    }

    int id;
        Animal2(int id) {
this.id=id;
            {
                System.out.println("animal is created");
            }
        }
    }
    class Dog2 extends Animal2{
        Dog2(){
            super(2);
            System.out.println("dog is created");
        }
    }
    class TestSuper3{
        public static void main(String args[]){
            Dog2 d=new Dog2();
            Animal2 animal2=new Animal2(4);
            //System.out.println(animal2.id=9);
            System.out.println(animal2);
        }}

