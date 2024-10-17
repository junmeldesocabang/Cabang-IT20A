
package activity2;

import java.util.Stack;

public class Activity2 {

        public static void main(String[] args) {
        
            Stack<String> mystack = new Stack<>();
        
        
        mystack.push("5");
        mystack.push("6");
        mystack.push("7");
         
        System.out.println("Stack: " + mystack);
        String topElement = mystack.pop();
        System.out.println("Popped: " + topElement);
       
           String peekedElement = mystack.peek();
        System.out.println("Peeked: " + peekedElement);
        
        boolean isEmpty = mystack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);
        
         int stackSize = mystack.size();
        System.out.println("Stack Size: " + stackSize);
    }
    
}
