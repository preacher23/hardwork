package refernce;

public class LambdaIntroduction {
    public static void main(String[] args) {
//        callfuncinterface callfuncinterface = new callfuncinterface();
//        callfuncinterface.mymethod();
        myfunctionalinterface myfunctionalinterface=()-> System.out.println("yess");
        myfunctionalinterface.mymethod();
    }  }
    interface myfunctionalinterface{
        void mymethod();
    }
//    class callfuncinterface implements myfunctionalinterface {
//
//        @Override
//        public void mymethod() {
//            System.out.println("yes");
//        }
//    }

