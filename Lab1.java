public class LuhnsAlgorithm {
    public static void main(String[] args) {
        System.out.print(checkDigit("7992739871"));
    }

    public static int checkDigit(String card){
    	int sum = 0;
    	int alter = 0;

    		for(int i = card.length(); i>=1; i--){
    			int temp = 0;

    			if(alter==0){
    				temp = Integer.parseInt(card.substring(i-1,i));
    					if(temp*2>9) sum += (temp*2 - 9);

    						else sum+= temp*2;

    				alter = 1;

    			}

    			else {
    				sum += Integer.parseInt(card.substring(i-1,i));
    				alter = 0;
    			}
    		//	System.out.println(sum);
    		}

    		return (sum*9)%10;
    }
}
