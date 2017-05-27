
//Greedy Approach always remove cylinders from the tallest stack 

//Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. 
//Cylinders are kept on stacks and height can be different

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // n1, n2, n3 are no. of cylinders
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1 = 0, h2 = 0, h3 = 0;// intially all height = 0
        // n1, n2, n3 are no. of cylinders on each stack and h1,h2,h3 are height of stack
        
        int stack1[] = new int[n1];
        for(int i=0; i < n1; i++){
            stack1[i] = in.nextInt();
            h1 = h1 + stack1[i] ;   
        }
        
        int stack2[] = new int[n2];
        for(int i=0; i < n2; i++){
            stack2[i] = in.nextInt();
            h2 = h2 +  stack2[i];
        }
        
        int stack3[] = new int[n3];
        for(int i=0; i < n3; i++){
            stack3[i] = in.nextInt();
            h3 = h3 + stack3[i];
        }
        
        int i1 = 0, i2 = 0, i3 = 0; // to count remaining cylinders in stack
        
        // Greedy Approach always remove from the stack of max height
        
        boolean equalHeight = false;
        
  
       // System.out.println(h1+ " " + h2 + " " + h3);
        
        while(!equalHeight){
            if(i1 < n1 && ( h1 > h2 || h1 > h3 )){
                h1 = h1 - stack1[i1];
                i1++;
            }
            else if(i2 < n2 && ( h2 > h1 || h2 > h3 )){
                h2 = h2 - stack2[i2];
                i2++;
            }
            else if(i3 < n3 && ( h3 > h1 || h3 > h2 )){
                h3 = h3 - stack3[i3];
                i3++;
            }
            
            if((h1 == h2 && h2 == h3) || (h1 == 0 && h2 == 0 && h3 == 0)) {
                 equalHeight = true;
                 System.out.println(h1);
            }
            
            
        }
        

        //System.out.println(h1);

    }
}
