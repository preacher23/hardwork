package dry;

public class Kiss {
    private static String getMonthName(int month){
        if ((month<1)||(month>12)){
            throw new IllegalArgumentException("month just be from 1to 12");

        }else {
            String[] months={"janurary","feb","mar"};
                    return months[month-1];
        }
    }
    public static void main(String[] args) {
      Kiss kiss=new Kiss();
      kiss.getMonthName(1);
    }
}
