package objectoriented;
class house{
private kitchen kitchen1;
public house(){
    kitchen1=new kitchen();
    kitchen1.setFood("food");

}
public String getfood(){
    return kitchen1.getFood();
}
}
class kitchen{
    private String food;

    public void setFood(String food) {
        this.food = food;
    }
    public String getFood(){
        return food;
    }
}
public class Compositiondemo {
    public static void main(String[] args) {
        house house1=new house();
        System.out.println(house1.getfood());
    }
}
