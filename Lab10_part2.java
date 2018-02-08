public class Solution {

    public static void main(String args[] ) throws Exception {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), k = Integer.MIN_VALUE;

       

        if((a & b) > k) k =  (a & b);

        if((a ^ b) > k) k =  (a ^ b);

        if((a | b) > k) k =  (a | b);

        if(~(a & b) > k) k = ~(a & b);

        if(~(a ^ b) > k) k = ~(a ^ b);

        if(~(a | b) > k) k = ~(a | b);

        if(~(b & a) > k) k = ~(b & a);

        if(~(b ^ a) > k) k = ~(b ^ a);

        if(~(b | a) > k) k = ~(b | a);

        if((~a & b) > k) k = (~a & b);

        if((~a ^ b) > k) k = (~a ^ b);

        if((~a | b) > k) k = (~a | b);

        if((~b & a) > k) k = (~b & a);

        if((~b ^ a) > k) k = (~b ^ a);

        if((~b | a) > k) k = (~b | a);

        System.out.print(k);

    }

}
