//implement stack and query , 1-push ,2-pop, 3-max in stack

//can be done like, push only maximum and ignore other push and pop.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of queries
        Stack<Integer> maxStack = new Stack<Integer>(); // to store max element, maxx at top always
        Stack<Integer> stack = new Stack<Integer>();
        
        int max = 0;
        for(int i=0; i< n; i++){
            int query = sc.nextInt();
            switch(query){
                case 1:
                    int x = sc.nextInt();
                    stack.push(x);
                    if (maxStack.isEmpty() || x >= maxStack.peek()) {
                            maxStack.push(x);
                    }
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if(poppedValue == maxStack.peek())
                        maxStack.pop();
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
                
                
            }
            
        }
    }
}
