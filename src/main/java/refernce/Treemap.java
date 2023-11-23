package refernce;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(19,"value");
        map.put(-1,"yes");
        map.put(-1,"yess");
        map.put(0,"why");
        System.out.println(map);
    }
}
