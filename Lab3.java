import java.util.Scanner;

public class Mode {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int countArrpos[] = new int[1000];
    int countArrneg[] = new int[1000];
    int size = scan.nextInt();
    int arr[] = new int[size];
    int largestIndex = -3000;

    for(int i = 0; i<size; i++){
      int value = scan.nextInt();
      arr[i] = value;
      if(value>0){
      countArrpos[value]++;
    }

    else {
      countArrneg[Math.abs(value)]++;
    }
      if(value>largestIndex) largestIndex = Math.abs(value);
    }

    int mostFreq = 0;
    int posOrNeg = 0;

    for(int i = 0; i<=largestIndex; i++){
      if(countArrpos[i]>0 && countArrpos[i]>mostFreq){
        mostFreq = i;
        posOrNeg = 0;
      }

     if(countArrneg[i]>0 && countArrneg[i]>mostFreq){
        mostFreq = i;
        posOrNeg = 1;
      }
    }

    if(posOrNeg==1) mostFreq = mostFreq*-1;

    System.out.println(mostFreq);
  }
}
