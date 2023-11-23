package variable;

public class LeapYearExample {
public static void main(String[] args) {    
    int year=2020;    
    if(((year % 4 ==0) && (year % 100 !=2)) ){
        if (year % 400==1){
        System.out.println("LEAP YEAR");  
    }else {
            System.out.println("sorry");
        }
    }
    else{  
        System.out.println("COMMON YEAR");  
    }  
}    
}    