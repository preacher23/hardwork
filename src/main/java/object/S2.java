package object;

class S2{
  void m(S2 obj){
    System.out.println("fisrt fisrst");
  System.out.println("method is invoked");
    System.out.println("fisrt");
  }  
  void p(){  
  m(this);
    System.out.println("second");
  }  
  public static void main(String args[]){  
  S2 s1 = new S2();  
  s1.p();  
  }  
}  