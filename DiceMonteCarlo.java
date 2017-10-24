import java.util.*;

public class DiceMonteCarlo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    int result[] = new int[7];

    for(int i = 1; i<=1000000; i++){
      //Roll a die, one million times
      int outcome = 1 + ran.nextInt(6);
      //System.out.println(outcome);
      result[outcome]++;
    }

    for(int i = 1; i<=6; i++){
      System.out.print(result[i] +" ");
    }
    System.out.println();
    double prob[] = new double[7];

    for(int i = 1; i<=6; i++){
     double value = (double)result[i]/1000000;
     System.out.println(value);
    }
  }
}
