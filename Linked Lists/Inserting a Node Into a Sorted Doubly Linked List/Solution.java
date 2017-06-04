/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    newNode.prev = null;
    
    Node temp = head;
    if(temp == null) return newNode;
    if(temp.data > data){
        newNode.next = temp;
        temp.prev = newNode;
        return newNode;
    }
    while(temp.next != null){
        if(temp.data <= data && temp.next.data >= data){
            Node remainList = temp.next;
            newNode.next = remainList;
            remainList.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp; 
            
            return head;
        }
        temp = temp.next;
    }

    temp.next = newNode;
    newNode.prev = temp;
    return head;
}

