//Given a node position from last, print the node value
/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

    // This is a "method-only" submission. 
     // You only need to complete this method.
    
int GetNode(Node head,int n) {
    int count = 0;
    Node temp = head;
    while(temp != null){
        count++;
        temp = temp.next;
    }
   // System.out.println(count); 
    
    Node temp1 = head;
    for(int i = 0; i < count - n - 1; i++){
        temp1 = temp1.next;
    }
    //System.out.println(temp1.data);
    return temp1.data;

}
