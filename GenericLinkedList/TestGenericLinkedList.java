public class TestGenericLinkedList {
  public static void main(String[] args) {
    LinkedList<String> listStrings = new LinkedList<String>();

    LinkedList<Integer> list = new LinkedList<Integer>();

    listStrings.push("HELLO");
    listStrings.push("RED");


    String s = listStrings.peekFirst();
    s = "new";

    System.out.println(listStrings.peekFirst());
    
  }
}
