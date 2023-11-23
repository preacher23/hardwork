package collection;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JavaCollectionIsEmptyExample2 {
    public static void main(String[] args) {  
        Collection<Integer> collection = new ConcurrentLinkedQueue<Integer>();
        //returns an exception for null element  
        collection.add(0);
        //returns true if the queue is empty  
        if(collection.isEmpty()){  
            System.out.println("Add some elements because the queue is empty.");  
        }  
        else{  
            System.out.println("Elements are : "+collection);  
        }  
    }  
}  