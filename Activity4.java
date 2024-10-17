
package activity4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Activity4 {

   public static void main(String[] args) {
    
        Queue<Integer> my = new PriorityQueue<>(Collections.reverseOrder());
       
       my.offer(8);
        my.offer(6);
         my.offer(10);
          my.offer(7);
           my.offer(9);
           
           while(!my.isEmpty()){
            System.out.println(my.poll());
        }
            System.out.println("After polling" + my);

    }
    
}
