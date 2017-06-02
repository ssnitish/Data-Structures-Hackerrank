/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
// You only need to complete this method 
  
int CompareLists(Node headA, Node headB) {
    Node tempA = headA;
    Node tempB = headB;
    while(tempA != null && tempB != null){
        if(tempA.data != tempB.data){
            return 0;
        }
        tempA = tempA.next;
        tempB = tempB.next;
        
    }
    if( tempA == null  && tempB == null)
        return 1;
    else
        return 0;
    
}
