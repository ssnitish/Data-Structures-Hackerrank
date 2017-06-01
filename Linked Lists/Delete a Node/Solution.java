/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    Node temp = head;
    
    if(position == 0){
        head = temp.next;
        return head;
    }
    
    for(int i = 0; i < position-1; i++){
        temp = temp.next;
    }
    // temp contains (position-1)th node
    
    Node toDelete = temp.next;
    temp.next = toDelete.next;
    
    return head;
    

}

