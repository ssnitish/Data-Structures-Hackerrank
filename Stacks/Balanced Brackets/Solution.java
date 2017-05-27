// Stacks Balanced Brackets

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
     public static boolean isBalanced(String s){
       int length = s.length();
       if(length == 0 || s ==null )
           return true ;
       
       //can be done using ArrayDeque, ArrayDeque is "likely to be faster than Stack when used as a stack" - Java documentation
       //instead of using if, can be used HashMap where '(' is key and ')' is value
       
       Stack<Character> stack = new Stack<Character>();
       for(int i=0; i < length ; i++){
           if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
               stack.push(s.charAt(i));
           }
           else if(s.charAt(i)==')' && !stack.empty() && stack.peek()=='(') stack.pop();
           else if(s.charAt(i)==']' && !stack.empty() && stack.peek()=='[') stack.pop();

           else if(s.charAt(i)=='}' && !stack.empty() && stack.peek()=='{') stack.pop();
           else return false;
       }
       return stack.empty() ? true : false ; // lastly stack should be empty.
   } 
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
             String input = in.next();
             
             boolean result = isBalanced(input);
             if(result)
                 System.out.println("YES");
             else
                 System.out.println("NO");
        }
    }
}
