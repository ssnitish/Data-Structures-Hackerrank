/*
  Merge two sorted linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

// This is a "method-only" submission. 
     // You only need to complete this method 

Node mergeLists(Node headA, Node headB) {
    
    Node result = null; // point to current node added to merge list
    if((headA == null) && (headB == null))
        return null;
    if((headA == null) && (headB != null))
        return headB;
    if((headA != null) && (headB == null))
        return headA;
    if(headA.data <= headB.data){
        result = headA;
        result.next = mergeLists(headA.next,headB);
    }
    else if(headA.data > headB.data){
        result = headB;
        result.next = mergeLists(headA,headB.next);     
    }
    return result;
}
