/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    
   
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    
    Node temp = head;
    if(temp == null){
        head = newNode;
        return head;
    }

    else{
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    
    
  
}
