import java.util.*;

public class Lab7 {
  public static void main(String[] args) throws IOException{
    Scanner scan = new Scanner(System.in);

    int size = scan.nextInt();
    int r = scan.nextInt();

    int grades[] = new int[size];
    String names[] = new String[size];

    for(int i = 0; i<size; i++){
      grades[i] = scan.nextInt();
      names[i] = scan.next();
    }

    sort(grades, names);
    System.out.println(names[size - r]);
  }

  public static void sort(int arr[], String s[]){
    for(int i = 1; i<arr.length; i++){
      for(int j = i-1; j>=0; j--){
        if(arr[j+1] < arr[j]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] temp;

          String t = s[j];
          s[j] = s[j+1]
          s[j+1] = t;
        }
      }
    }
  }
}
