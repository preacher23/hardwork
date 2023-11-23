package abstraction;

import java.util.HashMap;
import java.util.Map;

public class Primitiveobession {
    public static void main(String[] args) {
        Map<City,Population>map=new HashMap<>();
        City bombay=new City("good","bigg");
        City chennai= new City("v good","medium");
        Population bombaypopulation=new Population(1111,11);
        map.put(bombay,bombaypopulation);

//        map.put("gokul",1);
//        map.put("gokulnath",2);
//        map.put("gokulnath n",3);
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+","+m.getValue());
        }
    }
}
class City{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
 public City(String name,String size){
        this.name=name;
        this.size=size;
 }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    private String name;
    private String size;

}
class Population{
    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getKids() {
        return kids;
    }

    public void setKids(Integer kids) {
        this.kids = kids;
    }

    @Override
    public String toString() {
        return "Population{" +
                "adults=" + adults +
                ", kids=" + kids +
                '}';
    }

    Integer adults;
    Integer kids;
    public Population(Integer adults,Integer kids){
     this.adults=adults;
     this.kids=kids;
    }
}
