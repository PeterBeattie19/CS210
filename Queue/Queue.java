public class Queue {
  Node head;

  public boolean isEmpty(){
    return (head==null);
  }

  public int peek(){
    return head.data;
  }

  public void add(int data){

    if(isEmpty() == true){
      head = new Node(data);
      return;
    }
    Node insert = new Node(data);
    Node temp = head;

    while (temp.next != null){
      temp = temp.next;
    }
    temp.next = insert;
    return;
  }

  public int remove() { //THIS METHOD ASSUMES NO NULL POINTER EXCEPTIONS
    Node oldhead = head;
    head = head.next;
    return oldhead.data;
  }
}
