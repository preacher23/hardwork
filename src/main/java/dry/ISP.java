package dry;

interface Worker{
    public void work();


}
interface Sleep{
    public void sleep();
}

class Human implements Worker,Sleep{

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
}
class Robot implements Worker{

    @Override
    public void work() {

    }
}
public class ISP {
    public static void main(String[] args) {

    }
}
