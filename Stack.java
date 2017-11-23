public class Stack {
	Node head;

	public void push(char c){
		if(head == null){
			head = new Node(c);
			return;
		}

		Node oldhead = head;
		head = new Node(c);
		head.next = oldhead; 
		return; 
	}

	public char pop(){
		if(head == null) return ' '; 

		Node returnNode = head;
		head = head.next; //Potential Null Pointer Exception
		return returnNode.data;  
	}

	public boolean isEmpty(){
		return (head==null); 
	}
}