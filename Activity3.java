
package activity3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3 {

     public static void main(String[] args) {
      
        Queue<Integer> queue = new LinkedList<>();
       
        queue.add(6);
        queue.add(7);
        queue.add(8);
       
        int firstElement = queue.poll(); 
        int secondElement = queue.poll(); 
        
    System.out.println("Remaining elements in the queue: " + queue);
        queue.add(9);
        queue.add(10);
        
        int thirdElement = queue.poll(); 
    System.out.println("Remaining elements in the queue: " + queue);
    }
    
}
