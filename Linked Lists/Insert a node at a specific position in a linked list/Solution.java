/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    
    Node temp = head;
    
    if(temp == null ){
        return newNode;
    }
    if(temp != null && position == 0){
        newNode.next = temp;
        return newNode;
    }
    
    for(int i = 1; i < position; i++){
        temp = temp.next;
    }
    Node remainingList = temp.next;
    temp.next = newNode;
    newNode.next = remainingList;
    
    return head;
    
}
