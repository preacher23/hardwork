package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample{
    public static void main(String args[]){
//Creating Array
        String[] array={"Java","Python","PHP","C++","gokul"};
        String[] arr1={"iam","gokul"};
        System.out.println("Printing Array: "+ Arrays.toString(array));
        System.out.println(Arrays.toString(arr1));
//Converting Array to List
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
        for (String iam:arr1){
            list.add(iam);
        }
        ArrayList<String>all= new ArrayList<>();
        all.addAll(list);
        System.out.println("Printing List: "+all);

    }
}

