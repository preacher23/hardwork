package objectoriented;
class Addition{
    public static int var=1;
    public  int sum(int a,int b){
        int result =0;
        result=a+b;
        System.out.println(result);
        return result;
    }
    public static int get(){
        return var++;
    }
}
public class Additionexe {
    public static void main(String[] args) {
        Addition addition=new Addition();
        addition.sum(10,20);
        System.out.println(Addition.get());
        System.out.println(addition.get());
    }
}
