import java.util.Scanner;

public class Lab8 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Queue pq = new Queue();

    int num = Integer.parseInt(scan.nextLine());

    for(int i = 1; i<=num; i++){
      String line[] = scan.nextLine().split(" ");

      if(line[0].matches("REMOVE")) pq.poll();

      else{
        pq.push(line[1]);
      }
    }

    System.out.println(pq.poll());
  }

  public static class Node{
    String data;
    Node next;

    public Node(String s){
      this.data = s;
      return;
    }
  }

  public static class Queue{
    Node head;

    public void push(String s){
      if(head == null){
        head = new Node(s);
        return;
      }

      if(compare(s,head.data) == true){
        Node oldhead = head;
        head = new Node(s);
        head.next = oldhead;
        return;
      }

      Node prev = head;
      Node current = head.next;
      Node insert = new Node(s);

      while(current != null){
        if(compare(s,current.data) == true){
          prev.next = insert;
          insert.next = current;
          return;
        }
        prev = current;
        current = current.next;
      }

      current = insert;

    }

    private boolean compare(String before, String after){
      if(before.length() != after.length()) return (before.length() < after.length());

      return (before.compareTo(after) < 0);
    }

    public String poll(){
      if(head == null) return "";

      Node oldhead = head;
      head = head.next;
      return oldhead.data;
    }
  }
}
