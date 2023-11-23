package principle;
class Additionexe{
    public static int var=1;
    public  int add(int a,int b){
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static int get(){
        return var++;
    }

}
public class Addition {
    public static void main(String[] args) {
        Additionexe additionexe=new Additionexe();
        Additionexe additionexe1=new Additionexe();
        System.out.println(additionexe.add(12,21));
        System.out.println(Additionexe.get());
        System.out.println(additionexe.var);
        System.out.println(Additionexe.get());
        System.out.println(additionexe.var);
        System.out.println(additionexe1.var);
    }
}
