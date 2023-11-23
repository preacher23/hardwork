package collection;


import java.util.HashMap;
import java.util.Map;

class IterationExample4
{
    public static void main(String[] arg)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Sumit",  "Singh");
        map.put("Devesh", "Mishra");
        map.put("Rahul", "Tiwari");
        map.put("gokul","gokulnathhh");
        for (String name: map.keySet())         //iteration over keys
        {
//returns the value to which specified key is mapped
            String lastname=map.get(name);
            System.out.println("Key: " + name + ", Value: " + lastname);
        }
    }
}

