import java.util.Scanner;

public class PrimesUnderN {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int count = 1;
    int i = 3;

    while(i<=20){
      boolean isPrime = true;
      for(int j = 2; j<=Math.sqrt(i); j++){
        if(i%j==0) isPrime = false;
      }

      if(isPrime==true) count++;
      i++;
    }

    System.out.println(count);
  }
}
