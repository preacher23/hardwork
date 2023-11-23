package refernce;

public class Arrays {
    public static void main(String[] args) {
//        int[] x;
//        int []y={12,2,34};
//        int [] z=new int[5];
//        System.out.println(z[0]);
//        System.out.println(z[1]);
//        int[]a=new int[5];
//        for(int e:a){
//            System.out.println(e);
//        }
//        int len=a.length;
//        for (int i=0;i<len;i++){
//            System.out.println(a[i]);
//        }
//        int[] x= new int[2];
//        int a[]=x;
//        x[0]=1;
//        System.out.println(x[0]);
//        System.out.println(a[0]);
//        a[1]=2;
//        System.out.println(a[1]);
//        System.out.println(x[1]);
        int b[]={12,34,};
        int c[]={23,45,76};
        b=c;
        for (int e:b){
            System.out.println(e);
        }
        for (int e:c){
            System.out.println(e);
        }

    }
}
