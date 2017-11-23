import java.util.Scanner;

public class Directions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		String s = scan.nextLine();
		Stack st = new Stack(); 

		for(int i = 0; i<s.length(); i++){
			st.push(s.charAt(i)); 
		}

		for(int i = 0; i<s.length(); i++){
			char c = st.pop();

			if(c == 'N')System.out.print("S");
			if(c == 'S')System.out.print("N");
			if(c == 'W')System.out.print("E");
			if(c == 'E')System.out.print("W");
		}
	}
}