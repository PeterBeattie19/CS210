import java.util.*;

public class CoinMonteCarlo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    String s = scan.next();
    int x = scan.nextInt();
    int k = scan.nextInt();

    double result = 0;
    int count = 0;

    for(int i = 1; i<=1000000; i++){
      int countHeads = 0;
      int countTails = 0;

      for(int j = 1; j<=x; j++){
        int outcome = ran.nextInt(2);
        if(outcome==0) countHeads++;
        else countTails++;
      }
      if(s.matches("HEADS")){
      //  System.out.println("heads");
        count++;
        if(countHeads>=k) result++;
      }

      else if(countTails>=k) result++;
    }

    int val =(int) Math.round((double)100*(result/1000000));
    System.out.println(val);
  }
}
