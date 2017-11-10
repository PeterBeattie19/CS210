import java.util.*;

public class Lab6 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int size = scan.nextInt();
    String arr[] = new String[size];

    for(int i = 0; i<size; i++){
      arr[i] = scan.next();
    }

    sortNames(arr);
    print(arr);
  }

  public static void sortNames(String arr[]){
    for(int i = 1; i<arr.length; i++){
      for(int j = i-1; j>=0; j--){
        if(arr[j+1].length() < arr[j].length()){
          String temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }

        if(arr[j].length() == arr[j+1].length()){
          if(arr[j+1].compareTo(arr[j]) < 0){
            String temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
    }
  }

  public static void print(String arr[]){
    for(String s: arr) System.out.print(s +" ");
    System.out.println();
  }
}
