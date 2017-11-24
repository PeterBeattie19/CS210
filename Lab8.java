public class Lab7{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack st = new Scanne(System.in);

		String line[] = scan.nextLine().split(" ");    Go Back Arrived Go North 

		while(line[0].matches("Arrived") == false){
			if(line[1].matches("Back") == true){
				st.pop();
			}

			else{
				st.push(line[1]); 
			}
			line = scan.nextLine().split(" ");
		}

		while(st.isEmpty() == false){
			String s = st.pop();

			if(s.matches("North")) System.out.println("Go South");
			if(s.matches("South")) System.out.println("Go North");
			if(s.matches("East")) System.out.println("Go West");
			if(s.matches("West")) System.out.println("Go East");
		}
	}

	public static class Node {
		String data;
		Node next; 

		public Node(String s){
			data = s; 
		}
	}

	public static class Stack {
		Node head; 

		public void push(String s){
			if(head == null) return;

			Node oldhead = head;
			head = new Node(s);
			head.next = oldhead; 
			return;
		}

		public String pop(){
			if(head == null) return " ";

			Node returnhead = head;
			head = head.next;
			return returnhead.data; 
		}

		public boolean isEmpty(){
			return (head==null);
		}
	}
}